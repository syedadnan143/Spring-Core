package com.springcore.lifecycle;

public class Phone {
     private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Phone [price=" + price + "]";
	}
    	 
     public void open() {
    	 System.out.println("initializing init");
     }
     public void destroy() {
    	 System.out.println("destroying metnod");
     }
}
