package cmo.gg.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<String>hasSet= new HashSet<String>();
		
		hasSet.add("Anuj");
		hasSet.add("jay");
		hasSet.add("raja");
		hasSet.add("komal");
		hasSet.add(null);
		
		Iterator<String>itr=hasSet.iterator();
		
		while(itr.hasNext()) {
			
			
			System.out.println(itr.next());
		}
		
		for(String s:hasSet) {
			
			
			System.out.println(hasSet);
		}
		
		}

}
