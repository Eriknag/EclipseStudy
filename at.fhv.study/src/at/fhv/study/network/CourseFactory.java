/**
 * 
 */
package at.fhv.study.network;

import java.util.ArrayList;

import at.fhv.study.models.Course;

/**
 * @author inirv_000
 *
 */
public class CourseFactory {
	private static CourseFactory instance = null;
	
	private CourseFactory(){
		
	}
	
	public static CourseFactory getInstance(){
		if(instance == null){
			instance = new CourseFactory();
		}
		return instance;
	}
	
	public ArrayList<Course> getStudentCourses(String student_id){
		ArrayList<Course> courses =  new ArrayList();
		Course course = new Course();
		 
		
		return courses;
	}
}
