package com.gg.practice1;

public class FabDemo4 {

	static int n0 = 1, n1 = 2, n2 = 3;

	static void printfabnociseries(int Count) {

		if (Count > 0) {

			n2 = n1 + n0;

			n1 = n0;
			n0 = n2;
			System.out.println(n2 + "  ");
			printfabnociseries(Count - 1);

		}
	}

	public static void main(String[] args) {
		int Count = 10;

		System.out.println(n0 + " " + n1);

		printfabnociseries(Count - 2);
	}
}
