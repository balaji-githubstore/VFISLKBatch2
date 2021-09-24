package com.voya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private static By usernameLocator=By.name("authUser");
	private static By passwordLocator=By.id("clearPass");
	private static By languageLocator=By.name("languageChoice");
	private static By errorLocator=By.xpath("//button[@type='submit']");
	private static By invalidLocator=By.xpath("//div[contains(text(),'Invalid')]");	
	private static By descLocator=By.xpath("//p[contains(text(),'most')]");
	

	public static void enterUsername(WebDriver driver, String username) 
	{
		driver.findElement(usernameLocator).sendKeys(username);
	}

	public static void enterPassword(WebDriver driver, String password) 
	{
		driver.findElement(passwordLocator).sendKeys(password);
	}
	
	public static void selectLanguage(WebDriver driver,String languageText)
	{
		Select selectLanguage=new Select(driver.findElement(languageLocator));
		selectLanguage.selectByVisibleText(languageText);
	}
	
	public static void clickOnLogin(WebDriver driver)
	{
		driver.findElement(errorLocator).click();
	}
	
	public static String getInvalidErrorMessage(WebDriver driver)
	{
		String text= driver.findElement(invalidLocator).getText();
		return text;
	}
	
	public static String getApplicationDescription(WebDriver driver)
	{
		return driver.findElement(descLocator).getText();
	}
	
	public static void waitForPresenceOfUsernameElement(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(usernameLocator));
	}
	
	public static String getLoginPageTitle(WebDriver driver)
	{
		String title = driver.getTitle();
		return title;
	}

}



