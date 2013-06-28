package at.fhv.study.models;
import java.io.Serializable;


public class Homework implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String homework_name,homework_description,homework_teacher,homework_teacher_email;
	String homework_deadline;
	String homework_course;
	String homework_grade;
	
	

	public Homework(String homework_name,String homework_description,String homework_teacher,String homework_teacher_email,String homework_deadline,String homework_grade,String homework_course) {
	
		this.homework_name= homework_name;
		this.homework_description=homework_description;
		this.homework_teacher=homework_teacher;
		this.homework_teacher_email=homework_teacher_email;
		this.homework_deadline=homework_deadline;
		this.homework_grade=homework_grade;
		this.homework_course=homework_course;
	}
	
	public String getHomework_grade() {
		return homework_grade;
	}

	public void setHomework_grade(String homework_grade) {
		this.homework_grade = homework_grade;
	}
	
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
	
	public String getHomework_deadline() {
		return homework_deadline;
	}
	
	public void setHomework_deadline(String homework_deadline) {
		this.homework_deadline = homework_deadline;
	}
	
	public String getHomework_course() {
		return homework_course;
	}
	
	public void setHomework_course(String homework_course) {
		this.homework_course = homework_course;
	}
	
	public String getHomeworkd_grade() {
		return homework_grade;
	}
	
	public void setHomeworkd_grade(String homeworkd_grade) {
		this.homework_grade = homeworkd_grade;
	}
	

}
