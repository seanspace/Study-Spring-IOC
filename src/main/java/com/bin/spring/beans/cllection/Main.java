package com.bin.spring.beans.cllection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] arg){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		Person person = (Person) context.getBean("person3") ;
		System.out.println(person);
		
		System.out.println(context.getBean("newPerson"));
		
		DataSource dataSource = (DataSource) context.getBean("dataSource") ;
		System.out.println(dataSource);
		
		Person person4 = (Person) context.getBean("person4") ;
		System.out.println(person4);
	}

}
