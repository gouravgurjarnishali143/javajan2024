package com.gg.multithreading;

public class MyThreadDemo1 {

	public static void main(String[] args) {

		MyThread myThread = new MyThread();

		myThread.start();

		for (int i = 1; i <= 10; i++) {

			System.out.println("main thread");
		}

	}

}
