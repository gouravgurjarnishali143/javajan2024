package cmo.gg.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo1 {
	
	public static void main(String[] args) {
		
		LinkedList<String>cars= new LinkedList<String>();
		
		cars.add("volvo");
		cars.add("audi");
		cars.add("bmw");
		cars.add("rmg");
		cars.add(null);
		
		Iterator<String>itr= cars.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
			
			
			
		}
		
		
	
}
