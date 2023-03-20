package com.Project.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



@SpringBootApplication
public class Project1Application {

	private static void extracted(ConfigurableApplicationContext context) throws IOException {

		Student student = context.getBean(Student.class);
		System.out.println(" Student "+ Student.readData());
	}
	
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(Project1Application.class, args);
		extracted(context);
	}

}
