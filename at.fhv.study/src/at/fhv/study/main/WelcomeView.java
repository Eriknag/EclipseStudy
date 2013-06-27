/**
 * 
 */
package at.fhv.study.main;

import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.ISourceProviderListener;
import org.eclipse.ui.part.ViewPart;

/**
 * @author inirv_000
 *
 */
public class WelcomeView extends ViewPart implements ISourceProviderListener{
	
	public static final String viewID = "at.fhv.study.view.welcome";
	private Label label;

	/**
	 * 
	 */
	public WelcomeView() {
		SourceProvider.getInstance().addSourceProviderListener(this);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		label = new Label(parent, SWT.NONE);
		label.setAlignment(SWT.CENTER);
		label.setText("Welcome\n to\n FHV!");
		FontData[] fD = label.getFont().getFontData();
		fD[0].setHeight(76);
		label.setFont( new Font(parent.getDisplay(),fD[0]));		
		
		final ISourceProviderListener listener = this;
		parent.getShell().addListener(SWT.CLOSE, new Listener() {

		      @Override
		      public void handleEvent(Event event) {
		    	  SourceProvider.getInstance().removeSourceProviderListener(listener);
		      }
		   });
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		
	}

	@Override
	public void sourceChanged(int sourcePriority, Map sourceValuesByName) {
	}

	@Override
	public void sourceChanged(int sourcePriority, String sourceName,
			Object sourceValue) {
		label.setText("Welcome\n to\n FHV \n" + (String) sourceValue + "!");
	}
	
	@Override
	public String toString(){
		return this.viewID;		
	}
}
