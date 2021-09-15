package com.voya.royal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RoyalTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.royalcaribbean.com/account/create");
		
	
		driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("John");
		
		driver.findElement(By.xpath("//span[text()='Month']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'October')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'security question')]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'first car')]")));
		
		driver.findElement(By.xpath("//span[contains(text(),'first car')]")).click();
	    
	}
}




