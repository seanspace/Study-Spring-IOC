package com.bin.spring.beans.autowire;


public class Person {
	
	private String name ;
	private Address addrees ;
	private Car car;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddrees() {
		return addrees;
	}
	public void setAddrees(Address addrees) {
		this.addrees = addrees;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", addrees=" + addrees + ", car=" + car + "]";
	}
	
	
	
	

}
