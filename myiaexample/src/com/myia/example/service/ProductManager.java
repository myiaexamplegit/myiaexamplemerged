package com.myia.example.service;

import java.io.Serializable;
import java.util.List;

import com.myia.example.domain.Product;

public interface ProductManager extends Serializable{

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();
    
}