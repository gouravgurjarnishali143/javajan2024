package com.gg.practice2;

public class Bike {
	
	int id;
	int num;
	String name;
	String model;
	
	
	public void Bike(int  id,int num,String name,String model) {
		
		this.id= id;
		this.num= num;
		this.name=name;
		this.model= model;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	
	

}
