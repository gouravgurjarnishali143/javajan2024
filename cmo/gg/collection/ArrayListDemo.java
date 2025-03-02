package cmo.gg.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {;
		
		List<String>list=new ArrayList<String>();
		
		list.add("raja");
		list.add("jay");
		list.add("komal");
	list.add("gourav");
	list.add("uday");
	
	Iterator<String> itr= list.iterator();
	
	while(itr.hasNext()) {
	
	System.out.println(itr.next());
	}
	}
}
