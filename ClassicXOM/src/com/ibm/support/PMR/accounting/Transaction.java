package com.ibm.support.PMR.accounting;

import java.io.Serializable;
import java.util.Date;

import com.ibm.support.PMR.Customer;
import com.ibm.support.PMR.Article;

public class Transaction implements Serializable{

	
	 java.util.Date creationDate;
	
	Customer customer;
	Article product;

	/**
	 * 
	 */
	private static final long serialVersionUID = 4566418256704748834L;

	public Transaction()
	{
		creationDate= new Date();
	}
	
	public Transaction(Customer c, Article p)
	{
		this();
		customer=c;
		product=p;
	}
	public java.util.Date getCreationDate() {
		return creationDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Article getProduct() {
		return product;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o.getClass().equals(this.getClass())){
			Transaction transaction = (Transaction) o;
			return transaction.product.equals(this.product)
			&& transaction.creationDate.equals(this.creationDate)
			&& transaction.customer.equals(this.customer);
		}
		return super.equals(o);
	}
}
