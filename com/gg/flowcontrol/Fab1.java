package com.gg.flowcontrol;

public class Fab1 {
	public static void main(String[] args){

		int ax = 2;

		int px = 2;

		int temp = 0;



		System.out.println(ax+","+px);

		for (int  i = 2;i<10;i++){


		temp = ax+px;

		ax=px;

	px=	temp;

		System.out.println(","+temp);




		}





		}





		}


