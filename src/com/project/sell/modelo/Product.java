package com.project.sell.modelo;

public class Product {
	
	private String Name; 
	private double Price; 
	
	public Product() {
		
	}
	
	public String getName() {
		return Name; 
	}
	
	public double getPrice() {
		return Price; 
	}
	
	public Product(String name, double price) { 
		Name = name; 
		Price = price; 
	}
	
	public String priceTag() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(Name + " $" + String.format("%.2f", Price));
		return sb.toString(); 
	}
}
