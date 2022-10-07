package com.product.entity;

import java.time.LocalDate;

public class Product {
	private String productId;
	private String productName;
	private String unitOfMeasure;
	private LocalDate launchDate;

	public LocalDate getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(LocalDate launchDate) {
		this.launchDate = launchDate;
	}

	public String getProductId(){
	return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}


	
	public Product(String productId, String productName, String unitOfMeasure, LocalDate launchDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.unitOfMeasure = unitOfMeasure;
		this.launchDate = launchDate;
	}

}
