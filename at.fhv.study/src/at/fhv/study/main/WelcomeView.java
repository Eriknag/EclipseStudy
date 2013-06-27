/**
 * 
 */
package at.fhv.study.main;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * @author inirv_000
 *
 */
public class WelcomeView extends ViewPart {
	
	public static final String viewID = "at.fhv.study.view.welcome";

	/**
	 * 
	 */
	public WelcomeView() {
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setAlignment(SWT.CENTER);
		label.setText("Welcome\n to\n FHV!");
		FontData[] fD = label.getFont().getFontData();
		fD[0].setHeight(88);
		label.setFont( new Font(parent.getDisplay(),fD[0]));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		
	}

}
