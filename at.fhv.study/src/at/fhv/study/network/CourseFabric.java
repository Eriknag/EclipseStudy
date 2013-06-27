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
public class CourseFabric {
	private static CourseFabric instance = null;
	
	private CourseFabric(){
		
	}
	
	public static CourseFabric getInstance(){
		if(instance == null){
			instance = new CourseFabric();
		}
		return instance;
	}
	
	public ArrayList<Course> getStudentCourses(String student_id){
		ArrayList<Course> courses =  new ArrayList();
		Course course = new Course();
		 
		
		return courses;
	}
}
