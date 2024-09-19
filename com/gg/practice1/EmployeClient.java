package com.gg.practice1;

public class EmployeClient extends EmployeDemo {

	public static void main(String[] args) {

		EmployeClient e = new EmployeClient();

		e.setId(11);

		e.setName("komal");

		System.out.println(e.getId() + " " + e.getName());
	}

}
