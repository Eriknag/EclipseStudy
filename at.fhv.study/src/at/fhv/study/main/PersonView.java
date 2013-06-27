package at.fhv.study.main;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.graphics.Image;

public class PersonView extends ViewPart {

	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 10;
		layout.marginHeight = 15;
		layout.verticalSpacing = 0;
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
	    
	    Label lblID = new Label(parent, SWT.NONE);
	    lblID.setText("ID: 984685");
	    
	    Label lblName = new Label(parent, SWT.NONE);
	    lblName.setText("Logged in as:\nErik Nagelkerke");
	    parent.getShell().setBounds(0, 0, 195, 500);
	}
	
	private void setMenu(Composite parent){
		GridData listData = new GridData(SWT.CENTER, SWT.TOP, false, false);
		List menu = new List(parent, SWT.NONE);
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
