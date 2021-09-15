package com.voya.flights;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PhpTravelTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://phptravels.net/flights");
		
		
		Select selectClass=new Select(driver.findElement(By.id("flight_type")));
		selectClass.selectByVisibleText("Business");
		
		driver.findElement(By.id("round-trip")).click();
		
		driver.findElement(By.xpath("//input[@name='from']")).sendKeys("DAC");
		driver.findElement(By.xpath("//b[text()='DAC']")).click();

		driver.findElement(By.xpath("//input[@name='to']")).sendKeys("NEW");
		driver.findElement(By.xpath("//b[text()='NEW']")).click();
		
		
		driver.findElement(By.id("departure")).clear();
		driver.findElement(By.id("departure")).sendKeys("24-09-2021");
		
		driver.findElement(By.xpath("//span[text()='1']")).click();
		
		int adult=4;
		for(int i=2;i<=adult;i++)
		{
			driver.findElement(By.xpath("//i[@class='la la-plus']")).click();
		}

		int child=4;
		for(int i=1;i<=child;i++)
		{
			driver.findElement(By.xpath("(//i[@class='la la-plus'])[2]")).click();
		}
	    
	}
}




