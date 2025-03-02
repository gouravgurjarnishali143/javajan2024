package com.gg.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public interface MapDemo {
	
	public static void main(String[] args) {
		
		
		Map<Integer,String>map= new HashMap<>();
		
		map.put(1, "komal");
		map.put(2, "harsh");
		map.put(3,"jay");
		map.put(4, "neha");
		map.put(5,"ashish");
		
		Iterator<Map.Entry<Integer,String>>itr= map.entrySet().iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry<Integer,String> entrymap=itr.next();
			
			System.out.println(entrymap.getKey()+" "+entrymap.getValue());
			
		}
		
	}

}
