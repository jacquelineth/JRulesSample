package com.ibm.support.PMR;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.Vector;

public class Portfolio implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = -8635316652052168668L;
	
	public java.util.Vector<Customer> customersList; //domain 0,* class org.example.portfolioschema.Customer;
	 public Portfolio(){
		 customersList=new Vector<Customer>();
		 
		 categories= EnumSet.range(Category.Centurion, Category.Silver);
	 }
	 public void reverseCategory (){
		 categories=EnumSet.complementOf(categories);
	 }
	 
	  transient java.util.EnumSet<Category> categories;
	 public java.util.EnumSet<Category> getCategories() {
		return categories;
	}
	public boolean containsCategory(Category c){
		 return categories.contains(c);
	 }
	 @Override
	public String toString() {
		
		return "\nPortfolio:"+customersList.size()+" Categories"+categories.toString();
	}
}
