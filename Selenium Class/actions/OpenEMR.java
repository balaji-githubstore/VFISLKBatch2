package com.voya.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenEMR {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");

		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		Actions action=new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//div[text()='Reports']"))).perform();
//		
//		action.moveToElement(driver.findElement(By.xpath("//div[text()='Clients']"))).perform();
		
		action.moveToElement(driver.findElement(By.xpath("//div[text()='Reports']"))).moveToElement(driver.findElement(By.xpath("//div[text()='Clients']")))
		.build().perform();
		
		
		
		
		
		driver.findElement(By.xpath("//div[text()='List']")).click();
	}
}




