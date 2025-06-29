package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ConfigClass;
import com.entities.Student;

public class MainClass {
	public static void main(String[] args) {

		ApplicationContext context= new AnnotationConfigApplicationContext(ConfigClass.class);
		Student s =context.getBean(Student.class);
		Student s1 =context.getBean(Student.class);

		if(s.hashCode()==s1.hashCode())System.out.println("Same");
		else System.out.println("Different");
		
		System.out.println(s);
		
	}
}
