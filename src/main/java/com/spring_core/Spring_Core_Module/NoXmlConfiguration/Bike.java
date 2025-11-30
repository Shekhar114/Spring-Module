package com.spring_core.Spring_Core_Module.NoXmlConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Bike {
	@Value("Hero")
	private String name;
	@Value("Black")
	private String color;
	@Value("120000")
	private double price;
	@Override
	public String toString() {
		return "Bike [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	
	
}
