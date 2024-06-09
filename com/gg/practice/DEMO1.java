package com.gg.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class DEMO1 {
	
		
		
		 public static void main(String[] args) {
			 
			 
			 ArrayList<Integer>arraylist= new ArrayList<>();
			 
			 for(int i = 1;i<=10;i++) {
				 
				 
				 arraylist.add(i);
			 }
			 
			 System.out.println(arraylist);
			 
			 
			 Iterator<Integer>itr= arraylist.iterator();
			 
			 while(itr.hasNext()) {
				 
				 
				 Integer i = itr.next();
				 
				 
				 if(i%4==0) {
				 
				 System.out.println(i);
			 }else {
				 
				 
				 itr.remove();
			 }
				 
				 
			 }
			 
			 System.out.println(arraylist);
			 
			 

		 }
}