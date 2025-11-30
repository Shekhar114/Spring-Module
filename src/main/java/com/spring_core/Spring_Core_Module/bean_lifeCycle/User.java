package com.spring_core.Spring_Core_Module.bean_lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements InitializingBean,DisposableBean{
	
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
//	public void init() 
//	{
//		System.out.println("init method is call");	
//	}
//	
//	public void destroy() 
//	{
//		System.out.println("destroy method is call");	
//	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init calling............");
		
	}
	@Override
	public void destroy() throws Exception {
	// TODO Auto-generated method stub
		System.out.println("destroy calling..........");
	
	}
}
