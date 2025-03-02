package com.gg.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo99 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		list.add(null);
		list.add(99);
		list.add(88);
		list.add(76);
		list.add(66);
		
		//using itertaor
		
		System.out.println(list);
		
		Iterator<Integer> itr= list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}