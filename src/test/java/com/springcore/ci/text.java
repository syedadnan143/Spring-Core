package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
	public static void main(String[] args) {
	ApplicationContext context =   new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
	Addition add= (Addition) context.getBean("add");
	System.out.println(add);
    add.dosum();
 }

}