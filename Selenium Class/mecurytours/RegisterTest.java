package com.voya.mecurytours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.name("firstName")).sendKeys("bala");
		
		driver.findElement(By.name("lastName")).sendKeys("dina");
		driver.findElement(By.name("phone")).sendKeys("89897898");
		driver.findElement(By.id("userName")).sendKeys("bala@gmail.com");
		
		driver.findElement(By.name("submit")).click();
	}

}
