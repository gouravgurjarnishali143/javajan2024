package com.gg.operater;

public class ForLoopDemo {

	public static void main(String[] args) {

		int i, j, s = 1;
		for (i = 1; i <= 5; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print(s + " ");
				s = s + 1;
			}

			System.out.println();
		}

	}

}
