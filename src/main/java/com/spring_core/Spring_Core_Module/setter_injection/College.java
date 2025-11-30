package com.spring_core.Spring_Core_Module.setter_injection;

public class College {
	
	private int college_id;
	private String college_name;
	private String college_address;
	public int getCollege_id() {
		return college_id;
	}
	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public String getCollege_address() {
		return college_address;
	}
	public void setCollege_address(String college_address) {
		this.college_address = college_address;
	}
	@Override
	public String toString() {
		return "College [college_id=" + college_id + ", college_name=" + college_name + ", college_address="
				+ college_address + "]";
	}
	

}
