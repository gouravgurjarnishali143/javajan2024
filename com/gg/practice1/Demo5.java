package com.gg.practice1;

public class Demo5 {

	static int a = 10, b = 20, c = 40;

	static void Sum(int sum) {

		if (sum < 10) {

			c = a + b;
			b = c;
			c = a;

			System.out.println(c + " ");

			System.out.println(sum - 1);
		}
	}

	public static void main(String[] args) {

		int sum = 10;
		System.out.println(c + " " + a);
		System.out.println(sum - 2);
	}
}
