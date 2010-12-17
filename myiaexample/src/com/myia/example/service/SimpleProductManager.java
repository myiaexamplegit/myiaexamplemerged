package com.myia.example.service;
import java.util.ArrayList;
import java.util.List;

import com.myia.example.domain.Product;
import java.util.List;

public class SimpleProductManager implements ProductManager{

	private List<Product> products;

	public List<Product> getProducts() {
		return products;

    }

    public void increasePrice(int percentage) {
    	//TODO Auto-generated method stub 
    }

    public void setProducts(List<Product> products) {
    	this.products = products;
    }

}
