package com.voya.calculator;

public class Calculator {
	
	public static void add(int a,int b)
	{
		System.out.println("executing!!!");
		int res=a+b;
		System.out.println(res);
	}

	public static String getAuthorName()
	{
		String authorName="Bala";
		return authorName;
	}
	
	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	
	public void classDescription()
	{
		System.out.println("this class contains methods for doing basic caluculation");
	}
}
