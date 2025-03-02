package com.gg.practice;

public class Employee {
	
	int id;
	String name;
	private int lenght;
	 
	public Employee(int id,String name) {
		
		this.id = id;
		this.name= name;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(11,"neha");
		
		Employee e2= new Employee(22,"denny");
		
		Employee e3 = new Employee(33,"anney");
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		
		
	}

}
