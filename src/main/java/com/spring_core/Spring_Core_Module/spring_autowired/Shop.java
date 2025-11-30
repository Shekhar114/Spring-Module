package com.spring_core.Spring_Core_Module.spring_autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Shop {
	private int id;
	private String name;
	private String address;
	@Autowired
	private Customer customer;
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", address=" + address + ", customer=" + customer + "]";
	}
	public Shop(int id, String name, String address, Customer customer) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.customer = customer;
	}
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
