package com.voya.datatypes;

public class ArrayDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//20 35 45
		
		int[] numbers=new int[3]; //3*32 bit is used
		numbers[0]=20;
		numbers[1]=35;
		numbers[2]=45;
		
		System.out.println(numbers[1]);
		
		String[] colors=new String[3];
		colors[0]="red";
		colors[1]="green";
		colors[2]="yellow";
		
//		System.out.println(colors);
		System.out.println(colors[0]);
		System.out.println(colors[1]);
		//System.out.println(colors[]);
	}
}

