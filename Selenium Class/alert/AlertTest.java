package com.voya.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
			
		driver.findElement(By.xpath("//img[@alt='Go']")).click();
		
		//wait for alert to present - 50s 
		
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.alertIsPresent());
	
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
}
