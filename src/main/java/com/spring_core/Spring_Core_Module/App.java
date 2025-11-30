package com.spring_core.Spring_Core_Module;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_core.Spring_Core_Module.Expressionlanguage.ArithmeticOperation;
import com.spring_core.Spring_Core_Module.Expressionlanguage.Car;
import com.spring_core.Spring_Core_Module.NoXmlConfiguration.Bike;
import com.spring_core.Spring_Core_Module.NoXmlConfiguration.JavaConfiq;
import com.spring_core.Spring_Core_Module.NoXmlConfiguration.Vehicle;
import com.spring_core.Spring_Core_Module.beanScope.School;
import com.spring_core.Spring_Core_Module.bean_lifeCycle.User;
import com.spring_core.Spring_Core_Module.constructor_injection.Employee;
import com.spring_core.Spring_Core_Module.spring_autowired.Shop;
import com.spring_core.Spring_Core_Module.standalone_collection.Student;
import com.spring_core.Spring_Core_Module.sterotype_bean.Seller;


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
    	
//	//4. Using Autowired
//    	
//    	// (a) - using Xml
//    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AutowiredConfiq.xml");
// 	
//    	Shop shop =	(Shop) applicationContext.getBean("shop");
//    	
//    	System.out.println(shop);
    	
//    	//5. Create Standalone Collection
//    	ApplicationContext context = new ClassPathXmlApplicationContext("StandaloneCollectionConfiq.xml");
//    	
//    			Student student = context.getBean("student",Student.class);
//    			
//    			System.out.println(student);
    	
    	
//    	//6. Streotype bean created
//    	ApplicationContext context = new ClassPathXmlApplicationContext("StreotypeBean.xml");
//    	
//    			Seller seller = context.getBean("ob",Seller.class);
//    			
//    			System.out.println(seller);
//    	

    	
////    	//7. bean scope -> Singleton and Prototype
//    	ApplicationContext context = new ClassPathXmlApplicationContext("BeanScope.xml");
//    	
//    	School s = context.getBean("school",School.class);
//    	System.out.println(s.hashCode());
//    	School s1 = context.getBean("school",School.class);
//    	
//    		
//    		System.out.println(s1.hashCode());
//    		
    	
////	//8. Expression Language
//    	ApplicationContext context = new ClassPathXmlApplicationContext("ExpressionLanguageConfiq.xml");
//    				Car car = context.getBean("car",Car.class);
//    				System.out.println(car);
//	
//    				ArithmeticOperation applicationOperation = (ArithmeticOperation) context.getBean("ob");
//    				System.out.println(applicationOperation.toString());

////    			//8. Without using Xml file create java bean
    		    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiq.class);
    		    				Bike bike = context.getBean("getReference",Bike.class);
    		    				System.out.println(bike);
    		    				
    		    				Vehicle vehicle = context.getBean("vehicle",Vehicle.class);		
    		    				System.out.println(vehicle);
    }
}
