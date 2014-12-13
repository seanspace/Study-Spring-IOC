package com.bin.spring.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bin.spring.beans.autowire.Address;
import com.bin.spring.beans.autowire.Person;

public class Main {
	
	public static void main(String[] arg){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-relation.xml") ;
//		Address address = (Address) context.getBean("address") ;
//		System.out.println(address);
		Address address2 = (Address) context.getBean("address2") ;
		System.out.println(address2);
		
		Person person = (Person) context.getBean("person") ;
		System.out.println(person);
	}

}
