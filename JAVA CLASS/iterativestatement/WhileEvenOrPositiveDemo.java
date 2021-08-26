package com.voya.iterativestatement;

public class WhileEvenOrPositiveDemo {

	public static void main(String[] args) {
		
		double[] numbers= {45.2,0,-65,89.2,65.5,-89.2};
		
		
		int size = numbers.length;
		System.out.println(size);
		
		int i=0;
		
		while(i<size)
		{
			System.out.println(numbers[i]);
			i=i+1;
		}

	}

}
