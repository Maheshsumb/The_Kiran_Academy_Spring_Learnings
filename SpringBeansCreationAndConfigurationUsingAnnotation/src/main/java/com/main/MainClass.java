package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.College;
import com.beans.Student;
import com.configurations.ConfigClass;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext cxt=new AnnotationConfigApplicationContext(ConfigClass.class);
		Student s = cxt.getBean(Student.class);
		System.out.println(s);

	}

}
