package com.Day3Assignment;

public class Product {
	private int product_Id;
	private String name;
	private double price;
	private long quantity;
	Product(int product_Id,String name,double price,long quantity){
		this.product_Id=product_Id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	void displayProduct() {
		System.out.println("Product ID is "+this.product_Id);
		System.out.println("Product Name is "+this.name);
		System.out.println("Price of "+this.name+" is "+this.price);
		System.out.println("Quantity Of "+this.name+"is "+this.quantity);
	}
}
