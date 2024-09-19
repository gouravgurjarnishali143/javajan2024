package com.gg.practice1;

import java.util.Enumeration;
import java.util.Vector;

public class StudentClient {

	public static void main(String[] args) {

		Vector<Student> vector = new Vector<>();

		Student s1 = new Student(1, 1234556, "komal", "komalsingh12@gmail.com");

		Student s2 = new Student(2, 1234567, "neha", "nehasingh2345@gmail.com");

		Student s3 = new Student(3, 233573, "avinash", "avinashsingh24@gmail.com");

		vector.add(s1);
		vector.add(s2);
		vector.add(s3);

		Enumeration<Student> en = vector.elements();

		while (en.hasMoreElements()) {

			System.out.println(en.nextElement());
		}
	}

}
