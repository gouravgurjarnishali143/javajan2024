package com.gg.operater;

public class BreakDemo {
	
	public static void main(String[] args) {
		
	for(int i =0;i<5;i++) {
		
		for(int j=0;j<5;j++) {
			
			if(i==j)
			break;
			System.out.println(i+"     "+j);
		}
	}
	}

}
