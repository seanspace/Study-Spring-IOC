package com.bin.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*
		 * 使用spring前
		// 创建HelloWorld的一个对象.
		HelloWorld helloWorld = new HelloWorld() ;
		// 为name属性赋值
		helloWorld.setName("atguigu");
		// 调用hello方法.
		*/
		
		/**
		 * Spring帮我们,创建了实例,并对属性初始化了.
		 * 1. ApplicationContext是一个IOC容器.BeanFactory与之功能相同,是更为基础的,但开发时一般不用.
		 * 2. ApplicationContext在初始化化时,就实例化单例的bean.也就是说bean还有不是单例的.
		 * 3. ClassPathXmlApplicationContext从类路径下加载配置文件.
		 */
		// 1. 创建Spring的IOC容器对象.
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
		// 2. 从IOC容器中获取Bean实例.(使用ID获取)
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld") ;
		// (2).使用class去获取实例对象.(这种方式不用强转).缺点:同一个类配置了多个bean就会出问题.
		//HelloWorld helloWorld2 = context.getBean(HelloWorld.class) ;
		// 3. 调用hello方法.
		helloWorld.hello();
		
	}
}
