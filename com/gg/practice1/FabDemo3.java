package com.gg.practice1;

public class FabDemo3 {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int n3 = 2;

		int temp = 10;

		System.out.println(n1 + " " + n2);

		for (int i = 0; i < temp; i++) {

			n3 = n1 + n2;

			System.out.println(n3 + " ");

			n1 = n2;
			n2 = n3;

		}
	}

}
