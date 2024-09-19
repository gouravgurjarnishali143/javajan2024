package com.gg.interfacee;

public class LibraryClient implements Library {
	
	
	@Override
	
	public void library() {
		
		System.out.println("is seat are free");
	}
	
	public static void main(String[] args) {
		
		
		LibraryClient l1 = new LibraryClient();
		
		l1.library();
	}

}
