package com.spring_core.Spring_Core_Module.NoXmlConfiguration;

import org.springframework.beans.factory.annotation.Value;

public class Vehicle {
	@Value("Yamaha")
	private String name;
	@Value("Black")
	private String color;
	
	private Bike bike;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Vehicle(Bike bike) {
		super();
		this.bike = bike;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", color=" + color + ", bike=" + bike + "]";
	}
	
	

}
