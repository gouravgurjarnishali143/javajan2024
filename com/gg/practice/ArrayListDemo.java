package com.gg.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer>list= new ArrayList<>();
		
		for(int i = 0;i<10;i++) {
			
			list.add(i);
			
		}
		System.out.println(list);
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			
			Integer  i = itr.next();
			
			if(i%4==0);
			System.out.println(i);
		}
	}

}
