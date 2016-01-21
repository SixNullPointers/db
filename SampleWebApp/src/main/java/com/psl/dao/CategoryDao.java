package com.psl.dao;

import com.psl.bean.Category;


public interface CategoryDao {

	
	//create
	
	void insertCategory(Category cat);
	
	
	//Read
	
	Category getCategory(int catId);
	Category getCategoryByName(String categoryName);
	
	//Update
	void updateCategory(Category cat);
	
	//Delete
	void deleteCategory(Category cat);
	
}
