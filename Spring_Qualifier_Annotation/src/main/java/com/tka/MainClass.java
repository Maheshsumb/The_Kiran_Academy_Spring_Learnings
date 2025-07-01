package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
	
	ApplicationContext cxt=new AnnotationConfigApplicationContext(ConfigClass.class);
	User u1 =cxt.getBean(User.class);
	
	System.out.println(u1.getS1().calling());
	System.out.println(u1.getS2().calling());
	}
}
