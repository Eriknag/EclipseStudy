package at.fhv.study.main;

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
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.graphics.Image;

public class PersonView extends ViewPart {
	
	private Label labelUser;
	private Text inputUser;
	private Label labelPass;
	private Text inputPass;
	private Button btnLogin;

	@Override
	public void createPartControl(final Composite parent) {
		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 10;
		layout.marginHeight = 15;
		layout.verticalSpacing = 4;
		parent.setLayout(layout);
		GridData layoutData = new GridData(SWT.CENTER, SWT.TOP, false, false);
		parent.setLayoutData(layoutData);
		
		
		GridData imageLayout = new GridData(SWT.LEFT, SWT.TOP, false, false);
		imageLayout.widthHint = 150;
		imageLayout.heightHint = 150;
		final ImageLoader loader = new ImageLoader();
		loader.load(getClass().getResourceAsStream("YouDontSay.jpg"));
		final Image image = new Image(parent.getDisplay(), loader.data[0]);
		
		Canvas canvas = new Canvas(parent,SWT.NO_REDRAW_RESIZE);
		final Image image2 = new Image(parent.getDisplay(), image.getImageData().scaledTo(imageLayout.widthHint, imageLayout.heightHint));
		canvas.setLayoutData(imageLayout);
	    canvas.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				e.gc.drawImage(image2,0,0);
			}
	    });
	    
	    labelUser = new Label(parent, SWT.NONE);
		labelUser.setText("Username");


		KeyListener enterListener = new KeyListener(){
			@Override
			public void keyPressed(KeyEvent e){
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.keyCode == SWT.CR || e.keyCode == SWT.LF){
					tryLogin(parent);
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
				tryLogin(parent);
			}
		});
	}
	
	private void tryLogin(Composite parent){
		String username = inputUser.getText();
		String password = inputPass.getText();
		if (username.length() > 0 && password.length() > 0) {
			if (checkLogin(username, password)) {
				labelUser.dispose();
				inputUser.dispose();
				labelPass.dispose();
				inputPass.dispose();
				btnLogin.dispose();
			} else {
				MessageDialog.openError(parent.getShell(),
						"Wrong username or password",
						"Username or password was not correct, please try again.");
			}
		} else {
			MessageDialog.openError(
					parent.getShell(),
					"Fill in username or password",
					"Username or password was not filled in, please fill all fields in before loggin in.");

		}
	}

	/**
	 * TODO: actual check credentials
	 * 
	 * @return
	 */
	private boolean checkLogin(String user, String pass) {
		if (user.equals("Erik") && pass.equals("1234")) {
			return true;
		}
		return false;
	}
	
	private void changeToMainView(){
		
	}
	
	private void setMenu(Composite parent){
		GridData listData = new GridData(SWT.LEFT, SWT.CENTER, true, false);
		listData.widthHint = 150;
		List menu = new List(parent, SWT.NONE);
		menu.setLayoutData(listData);
		menu.setItems(new String[]{"Personal information", "Courses", "Grades", "TimeTables"});
		
		
	}

	@Override
	public void setFocus() {
		inputUser.setFocus();
	}

}
