package com.voya.iterativestatement;

public class CheckOddOrEvenDemo {

	public static void main(String[] args) {

		int[] numbers = { 45, 88, 1002, 65, 89, 650 };

		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println("even " + number);
			} else {
				System.out.println("odd " + number);
			}
		}

	}
}
