package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
       Demo d1 =context.getBean("demo",Demo.class);
       System.out.println(d1);
	}

}
