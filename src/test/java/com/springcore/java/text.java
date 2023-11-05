package com.springcore.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
	public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(myconfig.class);
    Student s1 =	context.getBean("addy",Student.class);
    System.out.println(s1);
    s1.read();
	}
}
