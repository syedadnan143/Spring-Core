package com.springcore.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.springcore.java")
public class myconfig {
	
	public Car mycar(){
		return new Car();
		
	}
	
     @Bean (name = {"addy" , "myxml"})
	public Student getmystu() {
		Student student = new Student(mycar());
				return student;
	}
	

}
