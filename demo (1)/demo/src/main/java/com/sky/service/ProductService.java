package com.sky.service;

import java.util.List;

import com.sky.domain.Product;

public interface ProductService {
	
	public void addProduct( Product porduct);
	public List<Product> getProduct();
	public Product getProductById(String id);
	public Product deleteProductById(String id);
	public Product updateProduct( Product newporduct);
}
