package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//    Phone p1=  (Phone) context.getBean("p1");
//    System.out.println(p1);
    context.registerShutdownHook();
    System.out.println("-----------------------");
//   Banana B1 = (Banana) context.getBean("B1");
//    System.out.println(B1);
    
    Example E1 = (Example) context.getBean("E1");
    System.out.println(E1);
	}

}
