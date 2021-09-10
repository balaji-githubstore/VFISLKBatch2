package com.voya.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2AlternateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm");
			
		driver.findElement(By.xpath("//img[@alt='Go']")).click();
				

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();

		System.out.println(alertText);

		alert.accept();
		
	}

}
