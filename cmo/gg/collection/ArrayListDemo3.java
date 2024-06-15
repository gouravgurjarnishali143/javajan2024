package cmo.gg.collection;



import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		
		ArrayList<String>arraylist = new ArrayList<String>();
		
		arraylist.add("sam");
		arraylist.add("dam");
		arraylist.add("koa");
		arraylist.add("jan");
		
		
		
		Iterator<String> itr = arraylist.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		for(String str: arraylist) {
			
			System.out.println(str);
			
		}
		}

}
