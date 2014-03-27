package com.ibm.support.PMR;

public class SellableArticle implements Article {
	public SellableArticle(String s) {
		name=s;
	}
	public SellableArticle (String s, int i) {
		this(s);
		price= i;
	}
	public SellableArticle(String s, float f){
		this(s,(int)f);
	}
	public SellableArticle(Object o) {
		java.lang.reflect.Field[] Fs= o.getClass().getDeclaredFields();
		for (java.lang.reflect.Field f: Fs){
			try{
			retrieveFieldMatching("[Pp]rice",o, f,this.getClass().getDeclaredField("price"));
			retrieveFieldMatching("[Nn]ame",o, f,this.getClass().getDeclaredField("name"));
			}
			catch(Exception e){e.printStackTrace();}
		}
	}
	/**
	 * @param o
	 * @param f
	 */
	private void retrieveFieldMatching(String matchingRegex,Object o, java.lang.reflect.Field source,java.lang.reflect.Field target) {
		if(source.getName().matches(matchingRegex)){
			try {
				source.set(target, source.get(o));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
	private String name; 
	public String getName() {
		return name;
	}
	int test$ee;
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
