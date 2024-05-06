package com.gg.opps;

public class ParentChildClient {

	public static void main(String[] args) {
		
		//case 1
		Parent parent1 = new Parent();
		
		parent1.m1();
		
		//case 2
		
		Child child1 = new Child();
		
		child1.m2();
		
		//case 3
		Parent parent2 = new Child();
		
		parent2.m1();
		
		
	}
}
