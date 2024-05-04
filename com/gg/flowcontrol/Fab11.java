package com.gg.flowcontrol;

public class Fab11 {
	public static void main(String[] args){
		int az = 1;
		int dz = 4;
	int temp = 0;
		for (int i =1;i<=10;i++){

		System.out.println(az+","+dz);

		temp= az+dz;
		az=dz;
		dz=temp;

		System.out.println(","+temp);

		}





		}


}
