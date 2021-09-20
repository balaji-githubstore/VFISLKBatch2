package com.voya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MessageCenterPage {
	
	
	public static void switchToMsgFrame(WebDriver driver)
	{
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='msg']")));
	}

	public static void clickOnAddNew(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
	}
	
	public static void typeMessage(WebDriver driver,String message)
	{
		driver.findElement(By.id("note")).sendKeys(message);
	}
	
	public static void selectType(WebDriver driver,String type)
	{
		Select selectType=new Select(driver.findElement(By.name("form_note_type")));
		selectType.selectByVisibleText(type);
	}
	
	public static void selectUserByIndex(WebDriver driver,int index)
	{
		Select selectName=new Select(driver.findElement(By.id("users")));
		selectName.selectByIndex(index);
	}
	
	public static void clickOnSendMessage(WebDriver driver)
	{
		driver.findElement(By.id("newnote")).click();
	}
	
	public static String getPatientErrorMessage(WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[contains(text(),'choose')]")).getText();
	}
	
	public static void switchOutOfFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
}


