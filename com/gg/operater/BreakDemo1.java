package com.gg.operater;

public class BreakDemo1 {
	public static void main(String[] args) {
		
		l1:
			
			for(int i = 0;i<5;i++) {
				
				for(int j =0;j<5;j++) {
					
					if(i==j)
						
						break l1;
					
					System.out.println(i);
				}
			}
			
	}

}
