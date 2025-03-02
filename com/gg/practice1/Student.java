package com.gg.practice1;

public class Student {

	private int id;

	private String name;

	private int num;

	private String email;

	Student(int id, int num, String name, String email) {

		this.id = id;
		this.name = name;
		this.num = num;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", num=" + num + ", email=" + email + "]";
	}

}
