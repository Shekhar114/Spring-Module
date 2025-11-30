package com.spring_core.Spring_Core_Module;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_core.Spring_Core_Module.bean_lifeCycle.User;
import com.spring_core.Spring_Core_Module.constructor_injection.Employee;
import com.spring_core.Spring_Core_Module.spring_autowired.Shop;


public class App 
{
    public static void main( String[] args )
    {
    	
    	//1. Using Injection using setter
//    	ApplicationContext applicatinContext = new ClassPathXmlApplicationContext("SetterInjectionConfiq.xml");
//    	Student student = (Student) applicatinContext.getBean("student");
//    	System.out.println(student);
//    	System.out.println(student.getName());
//    	System.out.println(student.getAddress());
    	
    	//2. Using Injection using constructor
//    	ApplicationContext applicatinContext = new ClassPathXmlApplicationContext("ConstructorInjectionConfiq.xml");
//    	Employee employee = (Employee) applicatinContext.getBean("employee");
//    	System.out.println(employee);
//    	
    	
    	
    	//3. Bean Life cycle
    	
    	// (a) - using Xml
//    	AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanlifeCycleConfig.xml");
//    	User user = (User) applicationContext.getBean("user");
//    	System.out.println(user);
//    	applicationContext.registerShutdownHook();
    	
	//4. Using Autowired
    	
    	// (a) - using Xml
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AutowiredConfiq.xml");
 	
    	Shop shop =	(Shop) applicationContext.getBean("shop");
    	
    	System.out.println(shop);
    	
    }
}
