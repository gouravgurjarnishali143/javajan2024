package com.gg.java;

public class SwapWithoutUsing3Variable1 {

	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 20;
		
		System.out.println("before swap the value"+a+"swap the value"+b);
		
		a= a+b;
		b=a-b;
		a=b-a;
		
		System.out.println("After swap the value "+a+"swap the value "+b);
		
		
	}
	
}