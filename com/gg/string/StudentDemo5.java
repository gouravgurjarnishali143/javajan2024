package com.gg.string;

public class StudentDemo5 {
	
	
	int id ;
	
    String name;
    
    public StudentDemo5 (int id, String name) {
    	
    	this .id =id;
    	
    	this. name = name;
 
    	
    	
    	
    }
	
	public static void main(String[] args) {
		
		
		
		Student s1 = new Student(1000,"shiv");
		
		System.out.println(s1.id);
	System.out.println(s1.name);

}
}