package com.gg.asserts;

public class Demo3 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			
		}catch( ArithmeticException ae) {
			
			System.out.println(10/2);
		}
		
		System.out.println("hello");
		}
		
	}


