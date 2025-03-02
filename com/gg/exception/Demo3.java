package com.gg.exception;

public class Demo3 {
	
	public static void main(String[] args) {
		
		
		int[] num = {1,2,3,4,5};
		
		try {
			
			System.out.println(num[9]);
		}catch(ArithmeticException e) {
			
			
			System.out.println(num[3]);
		}
		
		System.out.println("out of bound");
		
		
		
		
		
		
		
	}

}
