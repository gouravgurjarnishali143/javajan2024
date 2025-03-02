package cmo.gg.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
	TreeSet<String>treeSet=new TreeSet<>();
	
	treeSet.add("D");
	treeSet.add("A");
	treeSet.add("C");
	treeSet.add("B");
	treeSet.add("E");
	
	System.out.println(treeSet);
	
   Iterator<String>itr= treeSet.iterator();
   
   while(itr.hasNext()) {
	   
	   
	   
	   System.out.println(itr.next());
	   
   }
	
	
	}

}
