package com.gg.multithreading;

public class MyRunnable1 implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println("main thread");
		}
	}

}
