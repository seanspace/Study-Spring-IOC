package com.bin.spring.beans;

/**
 *  创建Spring的IOC容器对象.ApplicationContext时便调用了构造方法和setter方法.
 *  说明IOC容器初始化时就直接加载了所有被Spring管理的Bean.
 *
 */
public class HelloWorld {
	HelloWorld(){
		System.out.println("调用HellorWorld构造器!");
	}
	private String name ;
	
	public void setName(String name) {
		System.out.println("Spring为管理的Bean属性赋值!");
		this.name = name;
	}
	
	public void hello(){
		System.out.println("hello:" + name);
	}
}
