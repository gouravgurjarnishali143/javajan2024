package com.gg.practice1;

public class FabDemo {

	public static void main(String[] args) {

		int ac = 2;
		int ba = 4;
		int temp = 0;

		System.out.println(ac + " " + ba);

		for (int i = 2; i <= 10; i++) {

			temp = ac + ba;

			ac = ba;
			ba = temp;

			System.out.println(temp + " ");
		}
	}

}
