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
	   allCCs= new ArrayList<Customer.CreditCard>(Arrays.asList(new CreditCard() ));
   }
   
   
   //PMR87985
   public Phone firstAddedPhone;
   public Phone lasstAddedPhone;
   
   public class Phone implements Serializable{
	private static final long serialVersionUID = 1238621205366379211L;
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
}
