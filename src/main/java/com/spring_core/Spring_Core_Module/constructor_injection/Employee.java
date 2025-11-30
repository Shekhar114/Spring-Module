package com.spring_core.Spring_Core_Module.constructor_injection;

public class Employee {
	private int emp_id;
	private String emp_name;
	private String emp_address;
	private Company company;
	public Employee(int emp_id, String emp_name, String emp_address,Company company) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_address = emp_address;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_address=" + emp_address + ", company="
				+ company + "]";
	}
	
	

}
