package com.gg.operater;

public class EmloyeClient {
	
	public static void main(String[] args) {
		
		Employe [] e = {new Employe (111,"komal"),new Employe(222,"neha"),new Employe(333,"alok"),new Employe(444,"dipti")};
		
		for(int i = 0;i<e.length;i++) {
			
			
			System.out.println(e[i]);
		}
	}

}
