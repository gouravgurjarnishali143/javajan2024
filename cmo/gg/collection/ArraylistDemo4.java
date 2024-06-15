package cmo.gg.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo4 {
	
	public static void main(String[] args) {
		
		List<String>list = new ArrayList<String>();
		
		list.add("jay");
		list.add("komal");
		list.add("gouraav");
		list.add(null);
		list.add("shailu");
		
		Iterator<String> itr=  list.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
			
		}
		
		for(String str:list) {
			
			
			System.out.println(list);
		}
	}

}
