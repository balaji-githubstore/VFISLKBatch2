package com.voya.windows;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs2 {
	
	public static void main(String[] args) {	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.get("https://www.db4free.net");
		
		driver.findElement(By.xpath("//b[contains(text(),'phpMyAdmin')]")).click();
		
		ArrayList<String> windows =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("input_username")).sendKeys("123");
		//enter password
		
		//click go
		driver.close();
		
		driver.switchTo().window(windows.get(0));
		
		//get the title
		String title= driver.getTitle();
		System.out.println(title);
		
	}

}



