package com.voya.windows;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceTabs {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.get("https://www.salesforce.com/in/");
		
		driver.findElement(By.xpath("//span[contains(text(),'For Free')]")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1)); //goes to 2nd tab
		
		driver.findElement(By.name("UserFirstName")).sendKeys("bala");
		
		//fill the forms
		
		//quit the browser
		
	}

}
