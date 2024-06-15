package cmo.gg.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {

	public static void main(String[] args) {
		
		
		List<String>list= new LinkedList<String>();
		
		list.add("raja");
		list.add("komal");
		list.add("Shyam");
		list.add("alok");
		list.add(null);
				
		Iterator<String>itr= list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
}
