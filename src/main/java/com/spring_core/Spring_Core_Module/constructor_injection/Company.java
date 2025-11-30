package com.spring_core.Spring_Core_Module.constructor_injection;

public class Company {
	private int id;
	private String name;
	private String address;
	
	public Company(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
		
}
