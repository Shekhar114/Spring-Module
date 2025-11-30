package com.spring_core.Spring_Core_Module.Expressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class ArithmeticOperation {
	
	@Value("#{13+15}")
	private int sum;
	
	@Value("#{new java.lang.String('Aman')}")
	private String name;

	@Override
	public String toString() {
		return "ArithmeticOperation [sum=" + sum + ", name=" + name + "]";
	}


	
	

}
