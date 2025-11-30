package com.spring_core.Spring_Core_Module.NoXmlConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.spring_core.Spring_Core_Module.NoXmlConfiguration")
public class JavaConfiq {
	
	@Bean
	public Bike getReference() {
		Bike bike = new Bike();
		return bike;
	}
	
	@Bean("vehicle")
	public Vehicle getReferenceVehicle() {
		
		return new Vehicle(getReference());
	}

}
