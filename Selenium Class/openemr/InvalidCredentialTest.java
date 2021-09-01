package com.voya.openemr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidCredentialTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		String text = driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
		System.out.println(text);

		driver.findElement(By.id("authUser")).sendKeys("admin123");
		driver.findElement(By.id("clearPass")).sendKeys("pass");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String errorText = driver.findElement(By.xpath("//div[contains(text(),'Invalid')]")).getText();

		System.out.println(errorText);

	}
}
