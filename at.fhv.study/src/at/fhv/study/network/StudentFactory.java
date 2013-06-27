/**
 * 
 */
package at.fhv.study.network;

import java.text.DateFormat;
import java.util.Date;


import at.fhv.study.models.Student;

/**
 * @author inirv_000
 *
 */
public class StudentFactory {
	
	private static StudentFactory instance = null;
	
	private StudentFactory(){
		
	}
	
	public static StudentFactory getInstance(){
		if(instance == null){
			instance = new StudentFactory();
		}
		return instance; 
	}
	
	public Student getCurrentStudent(){
		Student student = new Student();
		student.setStudent_birthdate(new Date(1532153135l));
		
		//student.setStudent_course_list();
		
		return student;
	}
}
