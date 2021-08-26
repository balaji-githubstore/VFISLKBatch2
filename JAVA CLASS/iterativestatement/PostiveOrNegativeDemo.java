package com.voya.iterativestatement;

public class PostiveOrNegativeDemo {

	public static void main(String[] args) {
		
		
		double[] numbers= {45.2,0,-65,89.2,65.5,-89.2};
		
		//write for each loop and print the values
		
		for(double num : numbers)
		{
			if(num<0)
			{
				System.out.println("Negative "+num);
			}
			else if(num>0)
			{
				System.out.println("Positive "+num);
			}
			else
			{
				System.out.println("zero");
			}
		}
		

	}

}
