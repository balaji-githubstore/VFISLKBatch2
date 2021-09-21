package com.voya.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//just for understanding dataprovider

public class DemoTest {
	
	//admin,pass,English (Indian),OpenEMR
	//physician,physician,English (Indian),OpenEMR
	//accountant,accountant,English (Indian),OpenEMR
	
	@DataProvider
	public String[][] validMethodData()
	{
		String[][] main=new String[3][4];
		
		main[0][0]="admin";
		main[0][1]="pass";
		main[0][2]="English (Indian)";
		main[0][3]="OpenEMR";
		
		main[1][0]="physician";
		main[1][1]="physician";
		main[1][2]="English (Indian)";
		main[1][3]="OpenEMR";
		
		main[2][0]="accountant";
		main[2][1]="accountant";
		main[2][2]="English (Indian)";
		main[2][3]="OpenEMR";
		
		return main;
	}
		
	@Test(dataProvider = "validMethodData")
	public void validMethodTest(String username,String password,String language,String expectedValue)
	{
		System.out.println(username+password+language+expectedValue);
	}
	
	
	
	//john,john123
	//mark,makr123
	//paul,paul123
	
	
//	@DataProvider
//	public String[][] validData()
//	{
//		String[][] main=new String[3][2];
////		i - number of testcase - 3
////		j - number of parameter - 2
//	
//		main[0][0]="john";
//		main[0][1]="john123";
//		
//		main[1][0]="mark";
//		main[1][1]="mark123";
//		
//		main[2][0]="paul";
//		main[2][1]="paul123";
//		
//		return main;
//	}
	
	
	@DataProvider
	public String[][] validData()
	{
		String[][] main=new String[3][2];
		main[0][0]="john";
		main[0][1]="john123";
		
		main[1][0]="mark";
		main[1][1]="mark123";
		
		main[2][0]="paul";
		main[2][1]="paul123";
		
		return main;
	}
	
	//@Test(dataProvider = "validData")
	public void validTest(String username,String password)
	{
		System.out.println("valid Test!!!"+username+password);
	}
}




