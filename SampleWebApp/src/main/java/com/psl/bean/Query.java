package com.psl.bean;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

//@Entity
//@Table(name = "QUERY")
public class Query {

	//@Id
	//@GeneratedValue
	private int queryId;
	private String queryMessage;
	private Date queryDate;
	//@OneToOne( cascade={CascadeType.ALL})
	private Product product;
	private Customer customer;

	public Query() {
	}

	

	public int getQueryId() {
		return queryId;
	}



	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public String getQueryMessage() {
		return queryMessage;
	}

	public void setQueryMessage(String queryMessage) {
		this.queryMessage = queryMessage;
	}

	public Date getQueryDate() {
		return queryDate;
	}

	public void setQueryDate(Date queryDate) {
		this.queryDate = queryDate;
	}

	

}
