package com.gg.flowcontrol;

public class Fab3 {
	    public static void main (String[] args)    {
	        
	        int pr = 1;
	        int nx = 1;
	        int temp = 0;
	        
	        System.out.print(pr+","+nx);
	        
	        for (int i = 1; i<10; i++){
	            
	        temp = pr+nx;
	        pr = nx;
	        nx = temp;
	        
	        
	            
	        System.out.print(","+temp);
	        
	        }
	    }

}
