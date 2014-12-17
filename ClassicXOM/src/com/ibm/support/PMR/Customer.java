package com.ibm.support.PMR;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;


public class Customer implements Serializable{
	private static final long serialVersionUID = -1862538116578535757L;
public Category category;
   public String  name;
   public int CumulatedPurchase;
   public Customer(){
	   allCCs= new ArrayList<Customer.CreditCard>(Arrays.asList(new CreditCard(), new CreditCard() ));
	   firstAddedPhone =new Phone();
	   lastAddedPhone =new Phone();
   }
   
   
   //PMR87985
   public Phone firstAddedPhone;
   public Phone lastAddedPhone;
   
   public class Phone implements Serializable{
	private static final long serialVersionUID = 1238621205366379211L;
	public Phone(){content=new String();}
	public String content;
	   public boolean isUntrusted(){return content.isEmpty();}
   }
   
   public java.util.ArrayList<CreditCard>  allCCs;
   public class CreditCard implements Serializable {
	private static final long serialVersionUID = 1L;
	//public String bank;
	   public String CCnumber;
	   //public java.util.Date expirationDate;
   }
   
 
   @Override
public String toString() {
	// TODO Auto-generated method stub
	return "{"+this.getClass().getName()+"{ name:"+name+", Category:"+this.category.toString()+", Purchases:"+CumulatedPurchase +" }" ;
}
}
