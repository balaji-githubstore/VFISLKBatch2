package com.voya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	public static String getDashboardPageTitle(WebDriver driver)
	{
		String title = driver.getTitle();
		return title;
	}

	public static void clickOnMessages(WebDriver driver)
	{
		driver.findElement(By.xpath("//div[text()='Messages']")).click();
	}
}
