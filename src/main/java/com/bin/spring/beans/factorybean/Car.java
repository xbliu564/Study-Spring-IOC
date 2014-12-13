package com.bin.spring.beans.factorybean;

public class Car {
	private String brand ;
	private double price ;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
	public Car() {
		System.out.println("Car's constructors");
	}
	public Car(String string, int i) {
		this.brand = string ;
		this.price = i ;
	}

}
