package com.gg.exception;

public class Demo {

	public static void main(String[] args) {

		int a,b;
		try {
b=0;
 a =20/0;
			System.out.println("it will not print");

		} catch (Exception e) {

			System.out.println("it is   divisible by 0  ");
		}
	}

}
