package com.springcore.java;


public class Student {
	private Car car;
	
	public Student(Car car) {
		super();
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void read() {
		this.car.display();
		System.out.println("I am reading");
	}

}
