package com.gg.opps;

public class AccountClient {
	
	public static void main(String[] args) {
		
		
		Account account = new Account();
		
		account.setBalance(1100.9);
		
		System.out.println(account.getBalance());
	}

}
