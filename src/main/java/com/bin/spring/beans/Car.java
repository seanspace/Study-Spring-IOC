package com.bin.spring.beans;

public class Car {
	private String brand ;
	private String corp ;
	private int price ;
	private int maxSpeed ;
	public void setPrice(int price) {
		this.price = price;
	}
	public Car(String brand, String corp, int price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}

	
	

}
