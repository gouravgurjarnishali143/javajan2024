package cmo.gg.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo1 {
	
	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();
		
		list.add("jay");
		list.add("ram");
		list.add("shivva");
		list.add("OM");
		
	list.add(null);
	
	Iterator<String>itr=list.iterator();
	
while(itr.hasNext()) {
	
	
	System.out.println(itr.next());
}

		
	}

}
