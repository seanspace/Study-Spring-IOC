package com.bin.spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bin.spring.beans.annotation.controller.UserController;
import com.bin.spring.beans.annotation.repository.UserRepository;
import com.bin.spring.beans.annotation.service.UserService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotation.xml") ;
		
		TestObject to = (TestObject) context.getBean("testObject") ;
		System.out.println( to);
		
		UserController controller = (UserController) context.getBean("userController") ;
		System.out.println(controller);
		
		UserRepository userRepository = (UserRepository) context.getBean("userRepository") ;
		System.out.println(userRepository);
		
		UserService userService = (UserService) context.getBean("userService") ;
		System.out.println(userService);
	}
}
