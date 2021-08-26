package com.voya.iterativestatement;

public class Loops1Demo {

	public static void main(String[] args) {
		
		int[] numbers= {45,65,78,98,71,25,33,55,41,85};
		
		int size= numbers.length;
		
		
		for(int i=0;i<size;i=i+1)
		{
			if(numbers[i]<=50)
			{
				System.out.println("Value is "+numbers[i]+" printed");
			}
		}

	}

}
