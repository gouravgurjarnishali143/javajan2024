package com.gg.interfacee;

public class MyInterfaces implements School {

	@Override
	public void greenwood() {
		System.out.println("join the school");

	}

	public static void main(String[] args) {

		MyInterfaces myinterface = new MyInterfaces();

		myinterface.greenwood();

	}

}
