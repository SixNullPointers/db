package com.psl.bean;


//@Entity
//@Table(name = "PRODUCT")
public class Product {

	//@Id
	//@GeneratedValue
	private int productId;
	private String productName;
	private double productPrice;
	private String productDescription;
	private Category  category;
	
	public Product() {

	}
	
	
	
	public Product(String productName, double productPrice,
			String productDescription, Category category) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.category = category;
	}



	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productPrice=" + productPrice
				+ ", productDescription=" + productDescription + ", category="
				+ category + "]";
	}
	
	
	
}
