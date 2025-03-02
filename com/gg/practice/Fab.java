package com.gg.practice;

public class Fab {
	
	public static void main(String[] args) {
		
		int as = 1;
		int aw = 2;
		int temp = 0;
		
		System.out.println(as+","+aw);
		
		
		for(int i = 1;i<10;i++) {
		temp = as+aw;
		as=aw;
		as= temp;
		
		System.out.println(temp+",");
	}
	}
}
