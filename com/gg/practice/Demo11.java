package com.gg.practice;

import java.util.Enumeration;
import java.util.Vector;

public class Demo11 {
	
	public static void main(String[] args) {
		
		Vector<Integer> vector= new Vector<>();
		
		for(int i =1;i<10;i++) {
			
			vector.addElement(i);
		}
		
		System.out.println(vector);

		
		Enumeration<Integer> e = vector.elements();
		
		while(e.hasMoreElements()) {
			
			Integer i = e.nextElement();
			
			
			if(i%4==0);
			
			System.out.println(i);
			
		}
		
		
		
	}

}
