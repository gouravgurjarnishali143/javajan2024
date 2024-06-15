package cmo.gg.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 {
	
	public static void main(String[] args) {
		
		
		Vector<String>vector= new Vector<>();
		
		vector.add("raja");
		vector.add("jay");
		vector.add(null);
		vector.add("komal");
		
		Enumeration<String>e = vector.elements();
		
		
		while(e.hasMoreElements()) {
			
			
			System.out.println(e.nextElement());
			
			
		}
		
		
		
	}

}
