package com.psl.dao;

import com.psl.bean.RatingDetails;

public interface RatingDao {

	void insertRating(RatingDetails rateobj);
	RatingDetails getRating(int customerId,int productId);
	void updateRating(RatingDetails rateobj);
	void deleteRating(RatingDetails rateobj);
	
}
