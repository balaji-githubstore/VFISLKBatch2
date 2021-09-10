package com.voya.navigation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://google.com/");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		
		
	}

}
