package com.gg.flowcontrol;

public class FabDemo11 {
	
	public static void main(String[] args) {
		
		int as= 2;
		int ss= 3;
		int temp = 0;
		
		System.out.println(as+","+ss);
		
		for(int i = 2;i<=10;i++) {
			
			temp = as+ss;
			
			as=ss;
			
			ss=temp;
			
			System.out.println(temp+",");
			
		}
	}

}
