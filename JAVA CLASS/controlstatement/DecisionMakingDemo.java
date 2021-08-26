package com.voya.controlstatement;

public class DecisionMakingDemo {

	public static void main(String[] args) {

		int num = 10;
		if (num > 0) {
			System.out.println("positive number");
		} else if (num < 0) {
			System.out.println("negative number");
		} else {
			System.out.println("it's zero");
		}

		String browser = "chrome";
		
		if (browser == "ch" || browser=="chrome" ) 
		{
			System.out.println("Launch the chrome browser!!!");
		} 
		else if (browser == "edge" || browser == "ed") 
		{
			System.out.println("Launch the edge browser!!!");
		} 
		else if (browser == "safari") 
		{
			System.out.println("Launch the safari browser!!!");
		} 
		else 
		{
			System.out.println("Launch the firefox browser!!!");
		}
		
		
	}
}
