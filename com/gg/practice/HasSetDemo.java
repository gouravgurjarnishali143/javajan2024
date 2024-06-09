package com.gg.practice;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<Integer>hasSet= new HashSet<Integer>();
		
		for(int i = 0;i<10;i++) {
			
			hasSet.add(i);
			
			System.out.println(hasSet);
			
			
		}
		
		Iterator<Integer> itr= hasSet.iterator();
		
		while(itr.hasNext()) {
			
			Integer i = itr.next();
			
			if(i%4==0) {
				
				System.out.println(i);
			}
		}
	}

}
