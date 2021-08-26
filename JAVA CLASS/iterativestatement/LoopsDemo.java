package com.voya.iterativestatement;

public class LoopsDemo {

	public static void main(String[] args) {

		// 1 to 10
//		for (int i = 1; i <= 10; i = i + 1) {
//			System.out.println(i);
//		}
//
//		System.out.println("-------------");
		
		String[] colors=new String[3];
		colors[0]="red";
		colors[1]="green";
		colors[2]="yellow";
		
		//0 to 2
		for(int i=0;i<3;i=i+1)
		{
			System.out.println(colors[i]);
		}
		
		int[] numbers= {45,65,78,98,71,25,33,55,41};
		
		//print the numbers which are less than or equal to 50
		
		int size = numbers.length;
		System.out.println(size);
		

		
		
		
	}

}






