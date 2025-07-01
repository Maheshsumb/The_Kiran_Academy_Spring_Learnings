package com.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.College;
import com.beans.Student;

@Configuration
public class ConfigClass {
	@Bean
	public College collegeBean() {
		return new College();
	}
	@Bean
	public Student StudentBean() {
		return new Student();
		
	}
}
