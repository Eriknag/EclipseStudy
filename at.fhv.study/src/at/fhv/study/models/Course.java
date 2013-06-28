package at.fhv.study.models;
import java.io.Serializable;
import java.util.ArrayList;


public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String course_name,course_teacher,course_room,course_id;
	ArrayList<TimeTable> course_time_table;
	ArrayList<Double> course_grade_list;
	ArrayList<Homework> course_homework_list;
	
	public Course() {
		this.course_id=null;
		this.course_name=null;
		this.course_teacher=null;
		this.course_room=null;
		this.course_time_table=null;
		this.course_grade_list=null;
		this.course_homework_list=null;
	}
	
	public Course(String course_name,String course_id,String course_teacher,String course_room,ArrayList<TimeTable> course_time_table) {
		this.course_id=course_id;
		this.course_name=course_name;
		this.course_teacher=course_teacher;
		this.course_room=course_room;
		this.course_time_table=course_time_table;
		this.course_grade_list=null;
		this.course_homework_list=null;
	}
	
	public String getCourse_name() {
		return course_name;
	}
	
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	
	public String getCourse_teacher() {
		return course_teacher;
	}
	
	public void setCourse_teacher(String course_teacher) {
		this.course_teacher = course_teacher;
	}
	
	public String getCourse_room() {
		return course_room;
	}
	
	public void setCourse_room(String course_room) {
		this.course_room = course_room;
	}

	public ArrayList<TimeTable> getCourse_time_table() {
		return course_time_table;
	}

	public void setCourse_time_table(ArrayList<TimeTable> course_time_table) {
		this.course_time_table = course_time_table;
	}

	public ArrayList<Double> getCourse_grade_list() {
		return course_grade_list;
	}

	public void setCourse_grade_list(ArrayList<Double> course_grade_list) {
		this.course_grade_list = course_grade_list;
	}

	public ArrayList<Homework> getCourse_homework_list() {
		return course_homework_list;
	}

	public void setCourse_homework_list(ArrayList<Homework> course_homework_list) {
		this.course_homework_list = course_homework_list;
	}

	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	
	
	
	
}
