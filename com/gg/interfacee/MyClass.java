package com.gg.interfacee;

public class MyClass implements MyInterface {

	@Override
	public void wish() {

		System.out.println("good moring");
	}

	public static void main(String[] args) {
		
		MyClass myclass = new MyClass();
		
		myclass.wish();
	}
}
