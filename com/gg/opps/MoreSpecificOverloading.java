package com.gg.opps;

public class MoreSpecificOverloading {
	
	public void m1(StringBuffer sb) {
		
		System.out.println("StringBUfferversion");
	}
	
	public void m1(String s) {
		
		System.out.println("String version");
	}

}
