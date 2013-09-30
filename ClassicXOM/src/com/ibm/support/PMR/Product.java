package com.ibm.support.PMR;

import java.util.EnumSet;

public enum Product {
	Cola(1),Bread(2),Burger(5),CD(10),DVD(20),USBkey(25),Mouse(50),Game(75),LavaLamp(100),Laptop(300),Monitor(400),Phone(500);
	 private int price;
	 public int getPrice() {
		    return price;
	 }
	 Product(int p) {price=p;}
	 static public Product cheapestProduct(){
		 return (Product) EnumSet.allOf(Product.class).toArray()[0];
	 }
	 @Override
	public String toString() {
		
		return super.toString()+":€"+price;
	}
	 static public Product getAffordableProduct(int max){
		 Object[]list=  EnumSet.allOf(Product.class).toArray();
		 //sorting is needed, unless declared in order
		 int size=list.length-1;
		 while(size>0){
			 if(max >((Product)list[size]).price) 
				 return ((Product)list[size]);
			 else size--;
		 }
		 return ((Product)list[0]);
	 }
}
