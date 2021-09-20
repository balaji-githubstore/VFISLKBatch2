package com.voya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public static void enterUsername(WebDriver driver, String username) 
	{
		driver.findElement(By.name("authUser")).sendKeys(username);
	}

	public static void enterPassword(WebDriver driver, String password) 
	{
		driver.findElement(By.id("clearPass")).sendKeys(password);
	}
	
	public static void selectLanguage(WebDriver driver,String languageText)
	{
		Select selectLanguage=new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText(languageText);
	}
	
	public static void clickOnLogin(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public static String getInvalidErrorMessage(WebDriver driver)
	{
		String text= driver.findElement(By.xpath("//div[contains(text(),'Invalid')]")).getText();
		return text;
	}
	
	public static String getApplicationDescription(WebDriver driver)
	{
		return driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
	}
	
	public static void waitForPresenceOfUsernameElement(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("authUser")));
	}
	
	public static String getLoginPageTitle(WebDriver driver)
	{
		String title = driver.getTitle();
		return title;
	}

}



