package com.gg.practice;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedaListDemo {
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> list= new LinkedList<>();
		
		for(int i = 0;i<10;i++) {
			
			
			list.add(i);
			
		}
		
		System.out.println(list);
		
		Iterator<Integer> itr= list.iterator();
		
		while(itr.hasNext()) {
			
			Integer i = itr.next();
			
			if(i%90==0);
			System.out.println(i);
		}
		
		
	}
	
	
}


