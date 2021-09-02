package com.voya.oracledatabase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.oracle.com/in/database/");
		
		driver.findElement(By.xpath("//div[text()='View Accounts']")).click();	
		driver.findElement(By.xpath("//a[text()='Sign-In']")).click();
		
		String title= driver.getTitle();
		System.out.println(title);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(5000);
		
		String header=driver.findElement(By.xpath("//h2[contains(text(),'Oracle account')]")).getText();
		System.out.println(header);
		
		driver.findElement(By.xpath("//input[@id='sso_username']")).sendKeys("hello");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hello123");
		
		driver.findElement(By.xpath("//input[@id='signin_button']")).click();
		
		Thread.sleep(5000);
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'Invalid')]")).getText();
		System.out.println(text);
		
	}

}






