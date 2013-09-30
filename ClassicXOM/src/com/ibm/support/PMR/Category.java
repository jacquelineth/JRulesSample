package com.ibm.support.PMR;

public enum Category {
	Centurion,Platinum, Gold, Silver, Exclusive, Business, Express, Distinguished;
	@Override public String toString() {
		   //only capitalize the first letter
		   String s = super.toString();
		   return s.substring(0, 1) + s.substring(1).toLowerCase();
	}
}
