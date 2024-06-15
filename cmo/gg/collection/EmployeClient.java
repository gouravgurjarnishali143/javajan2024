package cmo.gg.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeClient {
	
	public static void main(String[] args) {
		
		
		List<Employe>list= new ArrayList();
		
	      Employe e1= new Employe(22,"raj");
	
		Employe e2= new Employe(33,"shiva");
		
		list.add(e1);		
		
		list.add(e2);
		
		Iterator itr= list.iterator();
		
	
		System.out.println("using iterator");
		
         for(Employe s :list) {
        	 
        	 System.out.println(s);
         }
		
	}

}
