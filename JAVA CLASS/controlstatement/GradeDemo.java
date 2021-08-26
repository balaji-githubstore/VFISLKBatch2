package com.voya.controlstatement;

public class GradeDemo {

	public static void main(String[] args) {

		int num = 79;

		if (num >= 90) {
			System.out.println("Your grade is an A");
		}

		else if (num > 79 && num < 90) {

			System.out.println("Your grade is a B");
		}

		else if (num > 59 && num < 80) {

			System.out.println("Your grade is a C");

		}

		else if (num > 44 && num < 60) {

			System.out.println("Your grade is a D");

		}

		else {
			System.out.println("Your grade is a F");
		}
	}

}
