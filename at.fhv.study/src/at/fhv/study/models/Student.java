package at.fhv.study.models;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.eclipse.swt.graphics.Image;




public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Course> student_course_list;
	ArrayList<Homework> student_homework_list;
	ArrayList<String> student_skills_list;
	ArrayList<Project> student_project_list;
	String student_birthdate;
	ArrayList<String> student_hobby_list;
	String student_registered_date;
	String student_name,student_surname,student_email,student_father,student_mother,student_password;
	Image student_image;
	String student_id;
	String student_department;
	
	public Student() {
		this.student_department=null;
		this.student_id=null;
		this.student_password=null;
		this.student_name=null;
		this.student_surname=null;
		this.student_birthdate=null;
		this.student_email=null;
		this.student_father=null;
		this.student_mother=null;
		this.student_image=null;
		this.student_registered_date=null;
		this.student_course_list=new ArrayList<Course>();
		this.student_hobby_list=new ArrayList<String>();
		this.student_project_list=new ArrayList<Project>();
		this.student_homework_list=new ArrayList<Homework>();
		this.student_skills_list=new ArrayList<String>();
	}
	
	public Student(String student_id,String student_password,String student_name,String student_surname,String student_birthdate,String student_email,String student_father,String student_mother,String department)
	{
		this.student_department=department;
		this.student_id=student_id;
		this.student_password=student_password;
		this.student_name=student_name;
		this.student_surname=student_surname;
		this.student_birthdate=student_birthdate;
		this.student_email=student_email;
		this.student_father=student_father;
		this.student_mother=student_mother;
		this.student_image=null;
		this.student_registered_date=null;
		this.student_course_list=new ArrayList<Course>();
		this.student_hobby_list=new ArrayList<String>();
		this.student_project_list=new ArrayList<Project>();
		this.student_homework_list=new ArrayList<Homework>();
		this.student_skills_list=new ArrayList<String>();
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

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
	
	public String getStudent_birthdate() {
		return student_birthdate;
	}
	
	public void setStudent_birthdate(String student_birthdate) {
		this.student_birthdate = student_birthdate;
	}
	
	public ArrayList<String> getStudent_hobby_list() {
		return student_hobby_list;
	}
	
	public void setStudent_hobby_list(ArrayList<String> student_hobby_list) {
		this.student_hobby_list = student_hobby_list;
	}
	
	public String getStudent_registered_date() {
		return student_registered_date;
	}
	
	public void setStudent_registered_date(String student_registered_date) {
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
	
	public void addCourse(Course course)
	{
		getStudent_course_list().add(course);
	}

	public String getStudent_password() {
		return student_password;
	}

	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}

	public String getStudent_department() {
		return student_department;
	}

	public void setStudent_department(String student_department) {
		this.student_department = student_department;
	}

	
	
	
	

}
