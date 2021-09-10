package com.voya.windows;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationWorldTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		driver.get("https://www.automationworld.com/");
		
//		driver.findElement(By.linkText("Close")).click();
		
		driver.findElement(By.xpath("//a[@rel='modal:close']")).click();
		
		driver.findElement(By.xpath("//span[text()='Subscribe']")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.xpath("//span[contains(text(),'receive')]/following::label[text()='No']")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'First Name')]/following::input")).sendKeys("john");
		
		driver.findElement(By.xpath("//label[contains(text(),'Last Name')]/following::input")).sendKeys("wick");
		
		driver.findElement(By.xpath("//label[contains(text(),'Email Address')]/following::input")).sendKeys("john@google.com");
		
		driver.findElement(By.xpath("//strong[contains(text(),'address')]/following::input")).sendKeys("https://www.automationworld.com/");
		
		Select selectCountry=new Select(driver.findElement(By.xpath("//label[contains(text(),'Country')]/following::select")));
		selectCountry.selectByVisibleText("BHUTAN");
		
		driver.findElement(By.xpath("//label[contains(text(),'City')]/following::input")).sendKeys("New");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		String errorMessage1=driver.findElement(By.xpath("//li[contains(text(),'Company')]")).getText();
		System.out.println(errorMessage1);
		
		String errorMessage2=driver.findElement(By.xpath("//ul[@class='validation']")).getText();
		System.out.println(errorMessage2);
	}
}





