package com.gg.interfacee;

public class PhoneClient implements Phone {

	@Override
	public void phone() {
		
		System.out.println("i want new phone");
		
	}
	
	public static void main(String[] args) {
		
		PhoneClient  p = new PhoneClient();
		
		p.phone();
	}
	
}


	
