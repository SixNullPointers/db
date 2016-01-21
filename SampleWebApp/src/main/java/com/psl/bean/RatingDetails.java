package com.psl.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity

public class RatingDetails {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int srNo;
	private int rating;
	@OneToOne( cascade={CascadeType.ALL} )
	@JoinColumn(name="productId")
	private Product product;
	@OneToOne( cascade={CascadeType.ALL})
	@JoinColumn(name="customerId")
	private Customer cutomer;
	
	public RatingDetails() {
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCutomer() {
		return cutomer;
	}

	public void setCutomer(Customer cutomer) {
		this.cutomer = cutomer;
	}

	
	
	
}
