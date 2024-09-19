package com.gg.interfacee;

public class Showroom implements Car {

	public void bmw1() {
		System.out.println("this is available or not");

	}

	public static void main(String[] args) {

		Showroom showroom = new Showroom();

		showroom.bmw1();
	}

	@Override
	public void bmw() {
		// TODO Auto-generated method stub
		
	}

}
