package com.gg.operater;

public class Demo {
	public static void main(String[] args) {
        int start = 2; // Starting number for the sequence
        for (int i = 1; i <= 5; i++) {
            for (int j = start; j < start + i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each sequence
            start = start * 10 + (start + i); // Update the starting number for the next row
        }
    }
}



