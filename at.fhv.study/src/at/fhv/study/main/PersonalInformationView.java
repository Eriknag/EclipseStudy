/**
 * 
 */
package at.fhv.study.main;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.part.ViewPart;

import at.fhv.study.models.Student;
import at.fhv.study.network.StudentFactory;

/**
 * @author inirv_000
 *
 */
public class PersonalInformationView extends ViewPart {
	
	public static final String viewID = "at.fhv.study.view.personal";

	private Canvas canvas;
	private Image canvas_image;
	private final int canvas_dimension = 150;
	private Student student;
	
	/**
	 * 
	 */
	public PersonalInformationView() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(2, false);
		parent.setLayout(layout);
		
		student = StudentFactory.getInstance().getCurrentStudent("Erik", "1234");
		
		GridData imageLayout = new GridData(SWT.LEFT, SWT.TOP, false, false);
		imageLayout.widthHint = canvas_dimension;
		imageLayout.heightHint = canvas_dimension;
		Image image = student.getStudent_image();
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
		
		GridData tableLayout = new GridData(SWT.LEFT, SWT.TOP, true, false);

		Table table = new Table(parent,  SWT.NO_SCROLL);
		table.setLayoutData(tableLayout);
		table.setBackground(parent.getBackground());

		TableItem name = new TableItem(table, SWT.NONE);
		name.setText("Name: " + student.getStudent_surname() + " " + student.getStudent_name());
		TableItem ID = new TableItem(table, SWT.NONE);
		ID.setText("ID: " + student.getStudent_id());

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String toString(){
		return this.viewID;		
	}

}
