package com.voya.medibuddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.medibuddy.in/");
		
		//skips if not available 
		//driver.findElement(By.id("wzrk-cancel")).click();
		
		driver.findElement(By.linkText("Signup")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='I have an Insurance/Corporate Account']")).click();
		
		driver.findElement(By.id("userName")).sendKeys("hello");
		
		driver.findElement(By.id("password")).sendKeys("hello123");
		
		//button[text()='Log in']
		driver.findElement(By.xpath("//button[text()='Log in']")).click();	
		
		String text= driver.findElement(By.xpath("//div[contains(text(),'incorrect')]")).getText();
		System.out.println(text);
	}
}



