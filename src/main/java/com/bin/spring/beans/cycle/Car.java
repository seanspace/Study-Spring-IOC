package com.bin.spring.beans.cycle;

public class Car {
	private String brand ;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		System.out.println("setBrand(brand);");
		this.brand = brand;
	}
	
	public Car() {
		System.out.println("Car's constructors");
	}
	
	public void init(){
		System.out.println("init...");
	}
	
	public void destroy(){
		System.out.println("destroy...");
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
	
	

}
