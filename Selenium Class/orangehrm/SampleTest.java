package com.voya.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
//		 By usernameLocator= By.id("txtUsername");
//		 WebElement ele= driver.findElement(usernameLocator);
//		 ele.sendKeys("Admin");
		
//		 WebElement ele= driver.findElement(By.id("txtUsername"));
//		 ele.sendKeys("Admin");
		 
		 
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 
		//tagname[@att='']

		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
