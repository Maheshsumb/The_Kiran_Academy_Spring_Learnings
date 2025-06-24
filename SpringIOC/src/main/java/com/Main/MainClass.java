package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Entity.Student;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		Student s =context.getBean(Student.class);
		System.out.println(s);

	}

}
