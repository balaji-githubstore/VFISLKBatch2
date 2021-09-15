package com.voya.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void invalidCredentialTest()
	{
		//set property and launch the browser
		//maximize and implicit wait 
		//navigate url
		//enter username as jack
		//enter password as jack123
		//select language English (Indian)
		//click on login
		
		//get actual value and compare with expected value = Invalid username or password
	}
	
	@Test
	public void validCredentialTest()
	{
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.openemr.io/b/openemr");
		
		driver.findElement(By.id("authUser")).sendKeys("admin123");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		Select selectLanguage=new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String actualValue= driver.getTitle();
		System.out.println(actualValue);
		
		Assert.assertEquals(actualValue, "OpenEMR");
	}
	
}
