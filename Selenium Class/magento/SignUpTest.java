package com.voya.magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpTest {

	public static void main(String[] args) {
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://account.magento.com/customer/account/create/");
	
		driver.findElement(By.id("firstname")).sendKeys("bala");
		
		driver.findElement(By.id("lastname")).sendKeys("dina");
		
		driver.findElement(By.id("email_address")).sendKeys("dina@gmail.com");
		
		driver.findElement(By.xpath("//input[@title='Email']")).sendKeys("ss");
	}

}
