package com.gg.exception;

public class Demo4 {
	public static void main(String[] args) {

		char[] s = { 'a', 'b', 'c', 'd' };

		try {

			System.out.println(s[6]);
		} catch (Exception e) {

			System.out.println("out of bound");
		}
		
		
		//System.out.println("out of bound");

	}

}
