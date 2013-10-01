package com.ibm.support.PMR;

import java.io.Serializable;



public class Store implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7263780442769770595L;
	java.util.EnumMap<Product,Integer> account;
	public Store(){
		account=new java.util.EnumMap<Product,Integer>(Product.class);
		for (com.ibm.support.PMR.Product p:Product.values()){
			account.put(p, new Integer(0));
		}
		legalStockValue =new Integer(0);
	}
	public Integer legalStockValue; 
	public void addSale(Product p){
		computedValue+=p.getPrice();
		account.put(p,account.get(p)+1);
	}
	public int computedValue;
	@Override
	public String toString() {
		return "Store containing "+legalStockValue+" of "+account.toString();
	}
}
