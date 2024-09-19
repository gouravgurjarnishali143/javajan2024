package com.gg.asserts;

public class Demo1 {

	public static void main(String[] args) {

		int a = 20;

		assert (a < 20) : "the value < 20 but is not";

		System.out.println(a);
	}
}
