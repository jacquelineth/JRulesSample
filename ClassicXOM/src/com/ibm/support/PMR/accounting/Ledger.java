package com.ibm.support.PMR.accounting;

import java.util.HashMap;
import java.util.Vector;

import com.ibm.support.PMR.Article;
import com.ibm.support.PMR.Customer;

public class Ledger {
	
	
	private java.util.HashMap<java.util.Date, Transaction> register;
	private short counter;
	private Ledger(){
		register= new HashMap<java.util.Date, Transaction>();
	}
	private static Ledger singleton=new Ledger();
	public static Ledger GetUniqueLedger(){
		return singleton;
	}
	public void addTransaction ( Transaction t){
		register.put(t.getCreationDate(),t);
	}
	
	public Transaction getTransaction (java.util.Date d){
		return register.get(d);
	}
	/**
	 * 
	 * @param date
	 * @return list of transaction of this day
	 * Calculate from same month and same day
	 */
	@SuppressWarnings("deprecation")//for java.util.Date.getDate()
	public java.util.Vector<Transaction> getAllTransactionsOfDate(java.util.Date d){
		java.util.Vector<Transaction> v= new Vector<Transaction>();
		for (Transaction transaction : register.values()) {
			java.util.Date cd=transaction.creationDate;
			if (d.getDate()==cd.getDate() && d.getDay()==cd.getDate()){
				v.add(transaction);
			}
		}
		
		
		return v;
	}
	
	public int addLedgerEntry(Customer c, Article a){
		addTransaction(new LedgerTransaction(c,a,++counter));
		return counter;
	}
	/**
	 * Transaction with indexing counter
	 * @author sp19075
	 *
	 */
	public class LedgerTransaction extends Transaction
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1882461461569429604L;

		public LedgerTransaction(Customer c, Article a, short n) {
			ID=n;
		}

		public short ID;
		
	}
}
