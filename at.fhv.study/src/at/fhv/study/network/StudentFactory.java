/**
 * 
 */
package at.fhv.study.network;

import java.text.DateFormat;
import java.util.Date;

import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import at.fhv.study.Activator;
import at.fhv.study.models.Student;

/**
 * @author inirv_000
 * 
 */
public class StudentFactory {

	private static StudentFactory instance = null;

	private StudentFactory() {

	}

	public static StudentFactory getInstance() {
		if (instance == null) {
			instance = new StudentFactory();
		}
		return instance;
	}

	public Student getCurrentStudent(String ID, String password) {
		Student student = null;
		if (ID.equals("Erik") && password.equals("1234")) {
			student = new Student();
			student.setStudent_name("Erik");
			student.setStudent_surname("Nagelkerke");
			student.setStudent_id("123456");
			student.setStudent_department("Computer Science");
			Image image = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "resources/test.jpg").createImage();
			student.setStudent_image(image);
		}
		return student;
	}
}
