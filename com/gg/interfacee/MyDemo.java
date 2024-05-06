package com.gg.interfacee;

public class MyDemo implements Demo{

	@Override
	public void greet() {

		System.out.println("good evening all!!!");
	}
	
	public static void main(String[] args) {
		
		MyDemo mydemo = new MyDemo();
		
		mydemo.greet();
	}
	

}
