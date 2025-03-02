package com.gg.asserts;

public class Demo4 {

	public static void main(String[] args) {
		int a = 10;

		try {

			assert (a > 10);

		} catch (AssertionError c) {

			System.out.println("I am stupid i am catching  this");

		}

		System.out.println(a);
	}
}
