package com.voya.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException  {
			
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.google.com/");
		
		Thread.sleep(10000);  //wait for 10s
		
		String title= driver.getTitle();
		System.out.println(title);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();	
	}

}
