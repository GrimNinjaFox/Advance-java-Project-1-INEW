package com.Project.Project;

public class Courses {

	private String id;
	private int courseNo;
	private int grade;
	private int creditHours;
	
	public Courses(String id, int courseNo, int grade, int creditHours) {
		this.id = id;
		this.courseNo = courseNo;
		this.grade = grade;
		this.creditHours = creditHours;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCourseno() {
		return courseNo;
	}

	public void setCourseno(int courseNo) {
		this.courseNo = courseNo;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getCreditHours() {
		return creditHours;
	}

	public void setCredithr(int creditHours) {
		this.creditHours = creditHours;
	}
	public String toString() {
        return "id{" + "courseNo='" + courseNo + '\'' + ", grade=" + grade + ", creditHours=" + creditHours + '}';
	
	}
}

