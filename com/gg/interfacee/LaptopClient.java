package com.gg.interfacee;

public class LaptopClient implements Laptop {
	
	@Override
public void Laptop() {
	System.out.println("this is your laptop");
}
	
	public static void main(String[] args) {
		
		LaptopClient laptop= new LaptopClient();
		
		laptop.Laptop();
	}

}
