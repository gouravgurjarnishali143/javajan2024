package com.gg.interfacee;

public class Client implements Right, Left {

	@Override

	public void m1() {

		System.out.println("m1 form client");
	}

	public static void main(String[] args) {

		Client client = new Client();

		client.m1();
		Right right = new Client();

		right.m1();

		Left left = new Client();

		left.m1();

	}

}
