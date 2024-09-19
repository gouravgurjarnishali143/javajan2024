package com.gg.practice1;

public class FabDemo2 {

	public static void main(String[] args) {

		int as = 0;
		int ba = 1;
		int temp = 0;

		System.out.println(as + " " + ba);

		for (int i = 0; i <= 10; i++) {

			temp = as + ba;
			as = ba;
			ba = temp;

			System.out.println(temp + " ");

		}

	}

}
