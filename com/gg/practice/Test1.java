package com.gg.practice;

import java.util.Enumeration;
import java.util.Vector;

public class Test1 {
	
	public static void main(String[] args) {
		
		Vector<Integer>list= new Vector<>();
		
		for(int i = 0;i<=20;i++) {
			
			
			list.addElement(i);
			
		}
		System.out.println(list);
		
		Enumeration<Integer> e = list.elements();
		
		while(e.hasMoreElements()) {
			
		Integer i=e.nextElement();
		
		if(i%4==0) {
			
			System.out.println(i);
		}
		}
		
	}

}
