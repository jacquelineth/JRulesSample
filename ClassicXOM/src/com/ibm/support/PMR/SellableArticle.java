package com.ibm.support.PMR;

public class SellableArticle implements Article {
	public SellableArticle(String s) {
		name=s;
	}
	private String name; 
	public String getName() {
		return name;
	}
	
	private int price;
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public Article getAffordableArticle(int max) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPrice(int iprice) {
		this.price = iprice;
	}

}
