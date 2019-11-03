package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class CourseApiApp extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);

	}

}
