package com.voya.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class NasscomTest {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://nasscom.in/");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Membership"))).perform();
		
		
		driver.findElement(By.linkText("Members Listing")).click();
		
		
	}
}
