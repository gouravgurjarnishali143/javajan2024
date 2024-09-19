package com.gg.multithreading;

public class MyRunnableClient2 {

	public static void main(String[] args) {

		MyRunnable myRunnable = new MyRunnable();

		Thread thread = new Thread(myRunnable);

		thread.start();

		for (int i = 1; i<= 10; i++) {

			System.out.println("bike");

		}

	}

}
