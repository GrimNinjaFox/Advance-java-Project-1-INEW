package com.Project.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



@Component
public class Student {

	private String id;
	private int first_name;
	private int email;
	private int gender;
	
	public Student(String id, int first_name, int email, int gender) {
		this.id = id;
		this.first_name = first_name;
		this.email = email;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getFirstname() {
		return first_name;
	}

	public void setFirstname(int first_name) {
		this.first_name = first_name;
	}

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", first_name=" + first_name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
	public List<Student> readData() throws IOException {
        FileReader fileReader = new FileReader("https://hccs-advancejava.s3.amazonaws.com/student_course.json");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Student> Student = new ArrayList();
        List<Courses> Course = new ArrayList();

        String header = bufferedReader.readLine(); 
        String line = bufferedReader.readLine(); 
	
	}

}
