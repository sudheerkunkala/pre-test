package com.product.service;

import com.product.entity.Product;

import java.util.List;

@FunctionalInterface
public interface ProductService {
	
	public List<Product> sort(List<Product> products);

}
