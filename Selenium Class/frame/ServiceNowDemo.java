package com.voya.frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNowDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.servicenow.com/");
		
		driver.findElement(By.linkText("Accept and Proceed")).click();

		driver.findElement(By.xpath("//a[contains(@aria-label,'sso-btn')]")).click();
		
		//frame
	    WebElement ele= driver.findElement(By.xpath("//iframe[@class='cmp-overlay--iframe']"));
		driver.switchTo().frame(ele);
		
		driver.findElement(By.xpath("//a[@data-com-cta='Get a ServiceNow ID']")).click();
		
		
		//come to main html
		//sleep 5s
		Thread.sleep(5000);
		//enter firstname
		driver.findElement(By.id("firstname")).sendKeys("bala");
		
		
		
	}
}



