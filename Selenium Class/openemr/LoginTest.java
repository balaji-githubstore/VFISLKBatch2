package com.voya.openemr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");

		//driver.findElement(By.linkText("Acknowledgments, Licensing and Certification")).click();

		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String title= driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//div[text()='About']")).click();
		
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
	}
}




