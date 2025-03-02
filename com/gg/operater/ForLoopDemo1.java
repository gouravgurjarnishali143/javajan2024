package com.gg.operater;

public class ForLoopDemo1 {

	public static void main(String[] args) {
		int a=1;

		for (int i = 1; i <= 4; i++) {

			for (int j = a; j <= a; j++) {

				a=a+1;

				System.out.print(a+" ");
			}
			System.out.println();
		}
	}

}
