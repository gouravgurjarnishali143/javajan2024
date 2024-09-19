package com.gg.practice1;

public class FabDemo1 {

	public static void main(String[] args) {

		int as = 2;

		int sw = 3;

		int temp = 0;

		System.out.println(as + " " + sw);

		for (int i = 2; i <= 10; i++) {

			temp = as + sw;
			as = sw;
			sw = temp;

			System.out.println(temp + " ");
		}
	}

}
