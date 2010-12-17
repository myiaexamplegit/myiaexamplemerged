package com.myia.example.repository;

import java.util.List;

import com.myia.example.domain.Product;

public interface ProductDao {
	
    public List<Product> getProductList();
    public void saveProduct(Product prod);

}
