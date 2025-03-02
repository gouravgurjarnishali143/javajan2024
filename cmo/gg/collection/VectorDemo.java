package cmo.gg.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	
	
	public static void main(String[] args) {
		 
		
		Vector<String>vector= new Vector<>();
		
		vector.add("raj");
		vector.add("gourav");
		vector.add("harsh");
	    vector.add("jay");
	    
	    Enumeration<String>e = vector.elements();
	    
	    while(e.hasMoreElements()) {
	    	
	    	System.out.println(e.nextElement());
	    }
	    for(String s :vector) {
	    	
	    	System.out.println(vector);
	    }

}
}