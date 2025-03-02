package com.gg.multithreading;

public class ThreadDemo {
	
	public static void main(String[] args) {
		 MyThread mythread = new MyThread();
		 
		 mythread.start();

		 
		 for(int i =1;i<=10;i++) {
			 
			 
			 System.out.println("main thread");
		 }
	}

}
