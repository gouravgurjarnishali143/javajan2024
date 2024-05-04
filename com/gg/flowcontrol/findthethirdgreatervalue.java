package com.gg.flowcontrol;

public class findthethirdgreatervalue {
	
	public static void main(String[] args) {
		
		int a = 30;
		int b = 40;
		int c = 60;
		
		if(a>b) {
		if(a>c) {
			
			System.out.println("A is the greater number."+a);
		}else {
			
			System.out.println("C is the greater number."+c);
		}
		
		}else if(b>c) {
			
			System.out.println("b is the greater number."+b);
			
		}else {
			
			System.out.println("C is the greater number."+c);
		}
		
		
	}

}
