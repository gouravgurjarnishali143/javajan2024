package com.gg.practice2;

public class BikeClient  {
	public static void main(String[] args) {

		Bike bike = new Bike();

		bike.setId(1);
		bike.setNum(888);
		bike.setName("R15");
		bike.setModel("2024");

		System.out.println(bike.getId() + " " + bike.getNum() + " " + bike.getName() + " " + bike.getModel());
	}

}
