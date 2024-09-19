package com.gg.practice;

public class Student {

	private int id;
	private String name;
	private int num;
	private String school;

	Student(int id, String name, int num, String school) {

		this.id = id;
		this.name = name;
		this.num = num;
		this.school = school;

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

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", num=" + num + ", school=" + school + "]";
	}

}
