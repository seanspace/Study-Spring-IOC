package com.bin.spring.beans.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] arg){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-cycle.xml") ;
		
		Car car = (Car) context.getBean("car") ;
		
		System.out.println(car);
		
		context.close() ;
	}

}
