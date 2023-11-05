package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Banana implements InitializingBean,DisposableBean {
 private double price;

@Override
public String toString() {
	return "Banana [price=" + price + "]";
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	
	this.price = price;
}

public Banana() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("initializes using interface");
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("destroying using interface");
}
}
