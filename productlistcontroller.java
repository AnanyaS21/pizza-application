package com.example.PizzaApplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PizzaApplication.domain.Product;

@RestController

public class productlistcontroller {
	
	@GetMapping("product/list")
   
	 public List<Product>products(){
		 List<Product> products=new ArrayList<>();
		 for(int i=1;i<20;i++) {
			 products.add(new Product(i, i*10,"Name"+i,"Desc"+i));
		 }
		 return products;
	 }
}
