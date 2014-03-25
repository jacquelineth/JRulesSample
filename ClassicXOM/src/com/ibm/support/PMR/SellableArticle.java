package com.ibm.support.PMR;

import java.lang.reflect.Field;

public class SellableArticle implements Article {
	public SellableArticle(String s) {
		name=s;
	}
	public SellableArticle(String s, int p) {
		this(s);
		price=p;
	}
	public SellableArticle(String s, float p) {
		this(s);
		price=(int)p;
	}
	public SellableArticle(Object o) {
		Class<? extends Object> c=o.getClass();
		for (Field f :c.getDeclaredFields()){
		System.err.println(	f.getType().toString());
		}
		System.err.println(o.toString());
	}
	private String name; 
	public String getName() {
		return name;
	}
	
	private int price;
	@Override
	public int getPrice() {

		return price;
	}

	@Override
	public Article getAffordableArticle(int max) {

		return null;
	}

	public void setPrice(int iprice) {
		this.price = iprice;
	}

}
