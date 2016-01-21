package com.psl.bean;


//@Entity
//@Table(name = "CATEGORY")
public class Category {

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName="
				+ categoryName + "]";
	}

	//@Id
	//@GeneratedValue
	private int categoryId;

	private String categoryName;

	public Category() {
	}

	

	public Category(String categoryName) {
		this.categoryName = categoryName;
	}



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
