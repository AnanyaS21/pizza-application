package com.example.PizzaApplication.domain;

import java.util.ArrayList;
import java.util.List;

public class cart {
	
	private List<Product> products=new ArrayList<>();
	
	public void addproduct(Product product) {this.products.add(product);};

}
