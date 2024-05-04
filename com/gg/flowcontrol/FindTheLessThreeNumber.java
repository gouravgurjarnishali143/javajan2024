package com.gg.flowcontrol;

public class FindTheLessThreeNumber {
	 public static void main(String[] args) {
		int a = 20;
		int b = 40;
		int c = 50;
		
		if(a<b) {
			if(a<c) {
				
				
				System.out.println("A is the less number.");
			}else {
				
				System.out.println("C is the  less number.");
			}
			
			
		}else if (b<c) {
			
			
			System.out.println("B is the less number.");
			
		}else {
			
			System.out.println("c is the less number.");
		}
	}

}
