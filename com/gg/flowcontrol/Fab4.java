package com.gg.flowcontrol;

public class Fab4 {

		public static void main(String[] args){

		int ac = 5;

		int dc = 4;

		int temp = 0;

		System.out.println(ac+","+dc);

		for(int i=5;i<15;i++){


		temp = ac+dc;

		ac=dc;

		dc=temp;

		System.out.println(","+temp);



		}






		}







}
