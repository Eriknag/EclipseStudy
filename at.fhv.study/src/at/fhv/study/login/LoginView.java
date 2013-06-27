package at.fhv.study.login;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.Parameterization;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.*;
import org.eclipse.ui.IPerspectiveRegistry;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.SWT;

public class LoginView extends ViewPart {
	public LoginView() {
	}

	public static final String ID = "at.fhv.study.view.login";

	private Text inputUser;
	private Text inputPass;
	private Button btnLogin;

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(final Composite parent) {
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 20;
		layout.marginHeight = 10;
		parent.setLayout(layout);

		Label labelUser = new Label(parent, SWT.NONE);
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

		Label labelPass = new Label(parent, SWT.NONE);
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
		parent.getShell().setBounds(0, 0, 200, 200);
	}
	
	private void tryLogin(Composite parent){
		String username = inputUser.getText();
		String password = inputPass.getText();
		if (username.length() > 0 && password.length() > 0) {
			if (checkLogin(username, password)) {
				String perspectiveID = "at.fhv.study.perspective.main";
				getSite().getWorkbenchWindow();
				IWorkbenchWindow window = getSite()
						.getWorkbenchWindow();
				try {
					window.openPage(perspectiveID, null);
					window.close();
				} catch (WorkbenchException ex) {
					System.out
							.println("ERROR! Unable to open Perspective");
					MessageDialog.openError(parent.getShell(),
							"Error Opening Perspective",
							"Could not open Perspective with ID: "
									+ perspectiveID);
				}
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

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		inputUser.setFocus();
	}
}