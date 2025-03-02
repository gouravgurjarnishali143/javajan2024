package com.gg.opps;

public class StuddentClient extends StudentDemo {

	public static void main(String[] args) {

		StuddentClient student = new StuddentClient();

		student.setId(1);
		student.setName("komal");
		student.setNum(1211);

		System.out.println(student.getId() + " " + student.getName() + " " + student.getNum());

	}

}
