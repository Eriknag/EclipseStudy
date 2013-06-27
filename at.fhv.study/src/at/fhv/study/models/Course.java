package at.fhv.study.models;

import java.text.DateFormat;
import java.util.ArrayList;


public class Course {

	String course_name,course_teacher,course_room;
	DateFormat course_time;
	ArrayList<Double> course_grade_list;
	ArrayList<Homework> course_homework_list;
	
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
	
	public DateFormat getCourse_time() {
		return course_time;
	}
	
	public void setCourse_time(DateFormat course_time) {
		this.course_time = course_time;
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
	
	
	
	
}
