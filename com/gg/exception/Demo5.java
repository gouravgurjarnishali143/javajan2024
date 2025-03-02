package com.gg.exception;

public class Demo5 {
	
	public static void main(String[] args) {
		
		
		int age = 16;
		
		try {
			
			System.out.println(age<18);
			
			
		}catch(Exception e ) {
			
			System.out.println("you cannot drive car");
		}
	}

}
