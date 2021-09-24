package com.voya.oops;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		WebDriverDemo driver=new ChromeDriverDemo(); //runtime poly
		
		driver.close();
		
		driver=new FirefoxDriverDemo();
		driver.close();
		
		
		
		//overloading
		Calculator cal=new Calculator();
		cal.add(45,45.2);
	}

}
