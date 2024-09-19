package com.gg.operater;

public class SwapTheNumber {
	
	public static void main(String[] args) {
		
		int a = 2;
		
		int b = 4;
		int c = 6;
		
		
		System.out.println("before swap the no a:"+a+" and the value b:"+b);
		
		a=c;
		b=a;
		c=b;
		
		System.out.println("After swap the no a:"+a+" and the value b:"+b);
	}

}
