package at.fhv.study.models;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.eclipse.swt.graphics.Image;


public class Student {
	
	ArrayList<Course> student_course_list;
	ArrayList<Homework> student_homework_list;
	ArrayList<String> student_skills_list;
	ArrayList<Project> student_project_list;
	Date student_birthdate;
	ArrayList<String> student_hobby_list;
	Date student_registered_date;
	String student_id, student_name, student_surname, student_department, student_email,student_father,student_mother;
	public String getStudent_department() {
		return student_department;
	}

	public void setStudent_department(String student_department) {
		this.student_department = student_department;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	Image student_image;
	
	public ArrayList<Course> getStudent_course_list() {
		return student_course_list;
	}
	
	public void setStudent_course_list(ArrayList<Course> student_course_list) {
		this.student_course_list = student_course_list;
	}
	
	public ArrayList<Homework> getStudent_homework_list() {
		return student_homework_list;
	}
	
	public void setStudent_homework_list(ArrayList<Homework> student_homework_list) {
		this.student_homework_list = student_homework_list;
	}
	
	public ArrayList<String> getStudent_skills_list() {
		return student_skills_list;
	}
	
	public void setStudent_skills_list(ArrayList<String> student_skills_list) {
		this.student_skills_list = student_skills_list;
	}
	
	public ArrayList<Project> getStudent_project_list() {
		return student_project_list;
	}
	
	public void setStudent_project_list(ArrayList<Project> student_project_list) {
		this.student_project_list = student_project_list;
	}
	
	public Date getStudent_birthdate() {
		return student_birthdate;
	}
	
	public void setStudent_birthdate(Date date) {
		this.student_birthdate = date;
	}
	
	public ArrayList<String> getStudent_hobby_list() {
		return student_hobby_list;
	}
	
	public void setStudent_hobby_list(ArrayList<String> student_hobby_list) {
		this.student_hobby_list = student_hobby_list;
	}
	
	public Date getStudent_registered_date() {
		return student_registered_date;
	}
	
	public void setStudent_registered_date(Date student_registered_date) {
		this.student_registered_date = student_registered_date;
	}
	
	public String getStudent_name() {
		return student_name;
	}
	
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	public String getStudent_surname() {
		return student_surname;
	}
	
	public void setStudent_surname(String student_surname) {
		this.student_surname = student_surname;
	}
	
	public String getStudent_email() {
		return student_email;
	}
	
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	
	public String getStudent_father() {
		return student_father;
	}
	
	public void setStudent_father(String student_father) {
		this.student_father = student_father;
	}
	
	public String getStudent_mother() {
		return student_mother;
	}
	
	public void setStudent_mother(String student_mother) {
		this.student_mother = student_mother;
	}

	public Image getStudent_image() {
		return student_image;
	}

	public void setStudent_image(Image student_image) {
		this.student_image = student_image;
	}
	

}
