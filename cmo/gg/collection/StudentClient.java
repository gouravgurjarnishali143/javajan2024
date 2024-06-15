package cmo.gg.collection;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
	public static void main(String[] args) {
		
		List<Student>list= new ArrayList<Student>();
		
		  Student s1 = new Student(22,"ram");
		  
		  Student s2 = new Student(55,"komal");
		  
		  
		  list.add(s1);
		  list.add(s2);
		  
		  System.out.println(list);
		  }

}
