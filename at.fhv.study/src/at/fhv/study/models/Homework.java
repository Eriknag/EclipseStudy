package at.fhv.study.models;

import java.text.DateFormat;


public class Homework {
	
	String homework_name,homework_description,homework_teacher,homework_teacher_email;
	DateFormat homework_deadline;
	Course homework_course;
	int homeworkd_grade;
	
	public String getHomework_name() {
		return homework_name;
	}
	
	public void setHomework_name(String homework_name) {
		this.homework_name = homework_name;
	}
	
	public String getHomework_description() {
		return homework_description;
	}
	
	public void setHomework_description(String homework_description) {
		this.homework_description = homework_description;
	}
	
	public String getHomework_teacher() {
		return homework_teacher;
	}
	
	public void setHomework_teacher(String homework_teacher) {
		this.homework_teacher = homework_teacher;
	}
	
	public String getHomework_teacher_email() {
		return homework_teacher_email;
	}
	
	public void setHomework_teacher_email(String homework_teacher_email) {
		this.homework_teacher_email = homework_teacher_email;
	}
	
	public DateFormat getHomework_deadline() {
		return homework_deadline;
	}
	
	public void setHomework_deadline(DateFormat homework_deadline) {
		this.homework_deadline = homework_deadline;
	}
	
	public Course getHomework_course() {
		return homework_course;
	}
	
	public void setHomework_course(Course homework_course) {
		this.homework_course = homework_course;
	}
	
	public int getHomeworkd_grade() {
		return homeworkd_grade;
	}
	
	public void setHomeworkd_grade(int homeworkd_grade) {
		this.homeworkd_grade = homeworkd_grade;
	}
	

}
