package com.spring_core.Spring_Core_Module.sterotype_bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Seller {
	
	@Value("1001")
	private int id;
	@Value("aman")
	private String name;
	@Value("delhi")
	private String address;
	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
