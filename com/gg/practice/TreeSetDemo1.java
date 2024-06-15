package com.gg.practice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
	
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("C");
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("D");
		
		System.out.println(treeSet);
		
		Iterator<String> itr= treeSet.iterator();
		
		while(itr.hasNext()) {}
		
		
		System.out.println(itr.next());
		
		
		
		
	}
	
	
}
