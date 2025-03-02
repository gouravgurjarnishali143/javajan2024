package com.gg.interfacee;

public class Demos implements Yes, No {

	@Override
	public void m1() {

		System.out.println(x);

	}

	public static void main(String[] args) {

		Demos Demo = new Demos();

		Demo.m1();
	}

}
