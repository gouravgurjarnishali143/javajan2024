package com.gg.flowcontrol;

public class Fab5 {
	
	public static void main(String[] args) {
		
		
		int az= 9;
		
		int sz=8;
		
		int temp=0;
		
		System.out.println(az+","+sz);
		
		for(int i=9;i<20;i++) {
			
			temp = az+sz;
			
			az=sz;
			
			sz=temp;
			
			System.out.println(","+temp);
			
			
			
		}
		
		
		
	}

}
