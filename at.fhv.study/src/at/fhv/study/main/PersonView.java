package at.fhv.study.main;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import at.fhv.study.Activator;
import at.fhv.study.models.Student;
import at.fhv.study.network.StudentFactory;

public class PersonView extends ViewPart {

	private Composite prnt;
	private Label labelUser;
	private Text inputUser;
	private Label labelPass;
	private Text inputPass;
	private Button btnLogin;
	private Canvas canvas;
	private Image canvas_image;
	private final int canvas_dimension = 150;
	private Student student = null;
	private final String course = "Courses";
	private final String timetable = "Timetable";
	private final String email = "Email";
	private final String personal = "Personal information";

	@Override
	public void createPartControl(Composite parent) {
		this.prnt = parent;
		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 10;
		layout.marginHeight = 15;
		layout.verticalSpacing = 4;
		parent.setLayout(layout);
		GridData layoutData = new GridData(SWT.CENTER, SWT.TOP, false, false);
		parent.setLayoutData(layoutData);

		GridData imageLayout = new GridData(SWT.LEFT, SWT.TOP, false, false);
		imageLayout.widthHint = canvas_dimension;
		imageLayout.heightHint = canvas_dimension;
		Image image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, "resources/default_avatar.png")
				.createImage();
		canvas = new Canvas(parent, SWT.NONE);
		canvas_image = new Image(parent.getDisplay(), image.getImageData()
				.scaledTo(canvas_dimension, canvas_dimension));
		canvas.setLayoutData(imageLayout);
		canvas.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				e.gc.drawImage(canvas_image, 0, 0);
			}
		});

		labelUser = new Label(parent, SWT.NONE);
		labelUser.setText("Username");

		KeyListener enterListener = new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.keyCode == SWT.CR || e.keyCode == SWT.LF) {
					tryLogin();
				}
			}

		};

		inputUser = new Text(parent, SWT.NONE);
		inputUser.addKeyListener(enterListener);

		labelPass = new Label(parent, SWT.NONE);
		labelPass.setText("Password");

		inputPass = new Text(parent, SWT.PASSWORD);
		inputPass.addKeyListener(enterListener);

		btnLogin = new Button(parent, SWT.PUSH);
		btnLogin.setText("Login");
		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.END;
		gd.horizontalSpan = 2;
		btnLogin.setLayoutData(gd);
		btnLogin.addKeyListener(enterListener);
		btnLogin.addMouseListener(new MouseListener() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}

			@Override
			public void mouseDown(MouseEvent e) {
			}

			@Override
			public void mouseUp(MouseEvent e) {
				tryLogin();
			}
		});
	}

	private void tryLogin() {
		String username = inputUser.getText();
		String password = inputPass.getText();
		if (username.length() > 0 && password.length() > 0) {
			if ((student = StudentFactory.getInstance().getCurrentStudent(
					username, password)) != null) {
				changeToMainView();
			} else {
				MessageDialog
						.openError(prnt.getShell(),
								"Wrong username or password",
								"Username or password was not correct, please try again.");
			}
		} else {
			MessageDialog
					.openError(
							prnt.getShell(),
							"Fill in username or password",
							"Username or password was not filled in, please fill all fields in before loggin in.");

		}
	}

	/**
	 * called after login
	 */
	private void changeToMainView() {
		if (!labelUser.isDisposed()) {
			labelUser.dispose();
			inputUser.dispose();
			labelPass.dispose();
			inputPass.dispose();
			btnLogin.dispose();
		}
		canvas_image = new Image(prnt.getDisplay(), student.getStudent_image()
				.getImageData().scaledTo(canvas_dimension, canvas_dimension));
		canvas.redraw();

		Label lblName = new Label(prnt, SWT.NONE);
		lblName.setText(student.getStudent_name() + " "
				+ student.getStudent_surname());

		Label lblID = new Label(prnt, SWT.NONE);
		lblID.setText(student.getStudent_id());

		Label lblDepartment = new Label(prnt, SWT.NONE);
		lblDepartment.setText(student.getStudent_department());

		GridData listData = new GridData(SWT.LEFT, SWT.CENTER, true, false);
		listData.widthHint = canvas_dimension;
		final List menu = new List(prnt, SWT.NONE);
		menu.setLayoutData(listData);
		menu.setItems(new String[] { course, timetable, email, personal });
		menu.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				try {
					openView(menu.getItem(menu.getSelectionIndex()));
				} catch (PartInitException e1) {
					MessageDialog.openError(prnt.getShell(), "View Error",
							"View could not be opened, please restart the programm.");
					e1.printStackTrace();
				}
			}

			@Override
			public void mouseDown(MouseEvent e) {
			}

			@Override
			public void mouseUp(MouseEvent e) {
			}
		});

		prnt.layout();
	}

	private void openView(String name) throws PartInitException {
		switch (name) {
		case course:
			getViewSite().getPage().showView(CourseView.viewID);
			break;
		case timetable:
			getViewSite().getPage().showView(TimetableView.viewID);
			break;
		case email:
			getViewSite().getPage().showView(EmailView.viewID);
			break;
		case personal:
			getViewSite().getPage().showView(PersonalInformationView.viewID);
			break;
		default:
			break;
		}
	}

	@Override
	public void setFocus() {
		inputUser.setFocus();
	}

}
