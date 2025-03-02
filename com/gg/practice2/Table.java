package com.gg.practice2;

public class Table {

	public static void main(String[] args) {

		Table table = new Table();

		table.twoTable();
		table.threeTable();
		table.fourTable();
	}

	public void twoTable() {

		int a = 2;

		for (int i = 1; i <= 10; i++) {

			System.out.println(a * i);
		}

	}

	public void threeTable() {

		int a = 3;
		for (int i = 1; i <= 10; i++) {
			System.out.println(a * i);

		}
	}

	public void fourTable() {
		int b = 4;
		for (int i = 4; i <= 10; i++) {

			System.out.println(b * i);

		}
	}
}
