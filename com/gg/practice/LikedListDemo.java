package com.gg.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class LikedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> list= new LinkedList<>();
		
		list.add(null);
		list.add("jay");
		list.add("harsh");
		list.add("denny");
		
		System.out.println(list);
		
		Iterator<String> itr= list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		for(String s :list) {
			
			System.out.println(s);
		}
	}

}
