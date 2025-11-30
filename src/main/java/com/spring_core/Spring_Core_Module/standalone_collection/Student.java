package com.spring_core.Spring_Core_Module.standalone_collection;

import java.util.List;
import java.util.Map;

public class Student {
	private int id;
	private String name;
	private List<String> subjects;
	private Map<String,Integer> marksAllSubject;
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
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public Map<String, Integer> getMarksAllSubject() {
		return marksAllSubject;
	}
	public void setMarksAllSubject(Map<String, Integer> marksAllSubject) {
		this.marksAllSubject = marksAllSubject;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subjects=" + subjects + ", marksAllSubject="
				+ marksAllSubject + "]";
	}
	
	

}
