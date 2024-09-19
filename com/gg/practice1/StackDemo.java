package com.gg.practice1;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		
		Stack<Integer>s = new Stack<>();
		
		
		s.push(23);
		s.push(29);
		s.push(30);
		s.push(31);
		
		System.out.println("Stack:"+s);
		
		
		int num =s.peek();
		
		System.out.println("elements on top :"+num);
		
		int location = s.search(30);
		
		System.out.println("locate the num:"+location);

	}

}
