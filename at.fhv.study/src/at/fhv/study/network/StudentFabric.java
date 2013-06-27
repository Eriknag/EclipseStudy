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
public class StudentFabric {
	
	private static StudentFabric instance = null;
	
	private StudentFabric(){
		
	}
	
	public static StudentFabric getInstance(){
		if(instance == null){
			instance = new StudentFabric();
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
