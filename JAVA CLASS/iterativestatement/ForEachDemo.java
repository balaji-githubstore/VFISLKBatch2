package com.voya.iterativestatement;

public class ForEachDemo {

	public static void main(String[] args) {
		
		int[] numbers= {45,65,78,98,71,25,33,55,41,85};
		
		
		for(int value : numbers)
		{
			if(value<=50)
			{
				System.out.println(value);
			}
		}
		
		String[] colors = {"red","green","blue","pink","yellow"};
		
		//faster
		for(String color : colors)
		{
			System.out.println(color);
		}

	}

}
