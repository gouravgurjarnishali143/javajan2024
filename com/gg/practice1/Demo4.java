package com.gg.practice1;

import java.util.Arrays;

public class Demo4 {
	
	public static void main(String[] args) {
		
		
		int a[]= {234,555,11,22,33,44,55,66,77,88};
		
		Arrays.sort(a);   
		System.out.println("elements are sort in ascending order");
		
		for(int i= 0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
	}

}
