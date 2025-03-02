package com.gg.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentClient {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		Student s1 = new Student(1, "komal", 1234567, "gwps");

		Student s2 = new Student(2, "neha", 2342556, "gwps");

		Student s3 = new Student(3, "avinash", 454353, "gwps");

		list.add(s1);

		list.add(s2);
		list.add(s3);

		Iterator<Student> itr = list.iterator();

		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
			


	}

}