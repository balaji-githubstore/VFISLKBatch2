package com.voya.salesforcesignup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpTest {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.xpath("//input[contains(@id,'UserFirstName')]")).sendKeys("John");
		driver.findElement(By.xpath("//input[contains(@id,'UserL')]")).sendKeys("wick");
		
		Select selectJob=new Select(driver.findElement(By.xpath("//select[contains(@id,'UserTitle')]")));	
		selectJob.selectByVisibleText("IT Manager");
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
		driver.findElement(By.name("start my free trial")).click();
		

	}

}
