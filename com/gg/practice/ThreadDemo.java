package com.gg.practice;

public class ThreadDemo {
	
	public static void main(String[] args) {
		 MyThread myThread = new MyThread();
		 myThread.start();
		 
		 for(int i = 1;i<=10;i++) {
			 
			 System.out.println("main thread");
			 
			
		 }
	}

}
