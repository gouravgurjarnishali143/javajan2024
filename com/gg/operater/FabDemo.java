package com.gg.operater;

public class FabDemo {
	
	public static void main(String[] args) {
		
		int as = 1;
		int az= 2;
		int temp = 0;
		
		System.out.println(as+" "+az);
		
		
		for(int i = 1;i<=10;i++) {
			
			temp =as+az;
			as=az;
			az=temp;
			
			System.out.println(temp+" ");
		}
	}

}
