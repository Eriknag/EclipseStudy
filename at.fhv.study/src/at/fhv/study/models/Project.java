package at.fhv.study.models;

import java.io.Serializable;

public class Project implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String project_name,project_place,project_hours,project_description,project_time;

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_place() {
		return project_place;
	}

	public void setProject_place(String project_place) {
		this.project_place = project_place;
	}

	public String getProject_hours() {
		return project_hours;
	}

	public void setProject_hours(String project_hours) {
		this.project_hours = project_hours;
	}

	public String getProject_description() {
		return project_description;
	}

	public void setProject_description(String project_description) {
		this.project_description = project_description;
	}

	public String getProject_time() {
		return project_time;
	}

	public void setProject_time(String project_time) {
		this.project_time = project_time;
	}
	

}
