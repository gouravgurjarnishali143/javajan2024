package com.gg.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hashmap=new HashMap<>();
		
		hashmap.put(22, "jaya");
		hashmap.put(11,"shivani");
		hashmap.put(33, null);
		hashmap.put(55,"komal");
		
		Iterator<Map.Entry<Integer,String>> itr= hashmap.entrySet().iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry<Integer, String> entrymap=itr.next();
			
			
			
			System.out.println(entrymap.getKey()+" "+entrymap.getValue());
		}
	}

}
