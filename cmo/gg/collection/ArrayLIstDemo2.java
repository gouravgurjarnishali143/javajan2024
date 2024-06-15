package cmo.gg.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLIstDemo2 {
	
	public static void main(String[] args) {
		
	List<String>list= new ArrayList<String>	();
	
	list.add(null);
	list.add("jay");
	list.add("vicky");
	list.add("shhiva");

	
	Iterator<String> itr= list.iterator();
	
	while(itr.hasNext()) {
		
		
		System.out.println(itr.next());
	}

}
}