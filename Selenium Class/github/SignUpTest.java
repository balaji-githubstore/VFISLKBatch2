package com.voya.github;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//implicit wait =30s
		driver.get("https://github.com/"); //wait until the page load happen // no time limit for page load
		
		driver.findElement(By.linkText("Sign in")).click(); 
		
		driver.findElement(By.id("login_field")).sendKeys("hello");
		
		driver.findElement(By.id("password")).sendKeys("hello123");
		
		driver.findElement(By.name("commit")).click();
		
		
		
	}

}
