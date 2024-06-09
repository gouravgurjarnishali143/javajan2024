package com.gg.practice;

public class SwapWithoutUsing3Variable {
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 4;
		
		System.out.println("before swap the  number"+a+"swap the number"+b);
		
		b=a-b;
		a=b-a;
		
		System.out.println("after swap the number"+a+"swap the number");
	}

}
