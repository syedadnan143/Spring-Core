package com.springcore.auto.wire;

public class Emp {
    private Address address;

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("starting");
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("by constructor");
	}
    
}
