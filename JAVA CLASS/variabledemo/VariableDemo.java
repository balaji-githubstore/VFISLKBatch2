package com.voya.variabledemo;

public class VariableDemo {
	public static int aS=10; //static variable or class variable 
	public int aNS=10; //non-static variable or instance variable 
	
	public static void main(String[] args) {
		
		
		System.out.println(VariableDemo.aS);
		
		VariableDemo obj=new VariableDemo();
		System.out.println(obj.aNS);
		
	}

}
