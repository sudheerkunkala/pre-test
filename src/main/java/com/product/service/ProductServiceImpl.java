package com.product.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.product.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements  ProductService{

	@Override
	public List<Product> sort(List<Product> products) {
		List<Product> sortedProducts=products.stream().sorted(Comparator.comparing(Product::getLaunchDate).reversed())
				.sorted(Comparator.comparing(Product::getProductId).reversed())
				.collect(Collectors.toList());
		return sortedProducts;
	}
}
