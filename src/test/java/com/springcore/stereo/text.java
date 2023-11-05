package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereo/config.xml");
   Student student= context.getBean("ad",Student.class);
   System.out.println(student.hashCode());
//   System.out.println(student);
//   System.out.println(student.getAddress());
   
       Student student2=   (Student) context.getBean("ad",Student.class);
       System.out.println(student2.hashCode());
       
      hash h1= context.getBean("hs",hash.class);
      hash h2= context.getBean("hs",hash.class);
      System.out.println(h1.hashCode());
      System.out.println(h2.hashCode());
	}

}
// in this we hava tried 2 different ways using xml and annotations 