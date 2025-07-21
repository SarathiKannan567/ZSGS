package com.Day3Assignment;

import java.util.ArrayList;

public class Store {
	static String storeName;
	static String storeLocation;
	ArrayList<Product> products=new ArrayList<>();
	void setStoreDetails(String name, String location){
		this.storeName=name;
		this.storeLocation=location;
	}
	void displayStoreDetails() {
		System.out.println("Store Name is "+this.storeName);
		System.out.println("Store Location is "+this.storeLocation);
	}
	void addProduct(Product product){
		this.products.add(product);
	}
	void displayAllProducts(){
		for(Product product:products) product.displayProduct();
	}
}


