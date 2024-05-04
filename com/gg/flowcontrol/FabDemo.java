package com.gg.flowcontrol;

public class FabDemo {
	
	public static void main(String[] args) {
		
		int az = 3;
		
		int xc = 5;
		
		int temp = 0;
		
		System.out.println(az+","+xc);
		
		
		for(int i = 3;i<=10;i++) {
			
			temp = az+xc;
			
			az=xc;
			
			xc= temp;
			
			System.out.println(temp+",");
			
		}
	}
	
	

}
