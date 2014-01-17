package com.ibm.support.PMR;

public interface Article {

	public abstract int getPrice();

	public Article getAffordableArticle(int max);
	

}