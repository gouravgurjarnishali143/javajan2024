package com.gg.exception;

public class Demo2 {
	public static void main(String[] args) {

		try {

			System.out.println(99/0);
		} catch (ArithmeticException ae) {

			System.out.println(77/7);
		}
	}
}
