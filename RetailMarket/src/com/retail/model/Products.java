package com.retail.model;

public class Products {

	private String ProductCategory;
	private String ProductSubCategory;
	private String ProductName;
	private int Quantity;
	private double rate;
	
	
	public String getProductCategory() {
		return ProductCategory;
	}
	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}
	public String getProductSubCategory() {
		return ProductSubCategory;
	}
	public void setProductSubCategory(String productSubCategory) {
		ProductSubCategory = productSubCategory;
	}
	public String getProductName() {
		return ProductName;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	
}
