package com.gg.interfacee;

public class GreetTo implements Greet {

	@Override

	public void goodmorning() {

		System.out.println("good night");
	}
	
	public static void main(String[] args) {
		
		
		GreetTo greet= new GreetTo();
		
		greet.goodmorning();
	}

}
