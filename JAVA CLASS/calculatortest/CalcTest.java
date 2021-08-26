package com.voya.calculatortest;

import com.voya.calculator.Calculator;

public class CalcTest {

	public static void main(String[] args) {
		
		Calculator.add(10, 10);
		
		String name=Calculator.getAuthorName();
		System.out.println(name);
		
		
		Calculator cal=new Calculator();
		cal.sub(10, 1);
		
		cal.classDescription();
	}

}
