package com.gg.opps;

public class CustomerClient {
	
	public static void main(String[] args) {
		
		
		Customer customer= new Customer();
		
		customer.setId(1);
		
		
		customer.setName("kishor");
		
		customer.setEmail("kishor22@gmail.com");
		
		customer.setBalance(20000);
		
		
		System.out.println(customer.getId()+" "+customer.getName()+" "+customer.getEmail()+"  "+customer.getBalance());
	}

}
