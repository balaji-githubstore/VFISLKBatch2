package com.voya.frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OpenEMRMessageTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");

		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");		
		Select selectLanguage=new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[text()='Messages']")).click();
		
		//iframe[contains(@src,'messages.php')]
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='msg']")));
		
		driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
		
		driver.findElement(By.id("note")).sendKeys("hello");
		
		Select selectType=new Select(driver.findElement(By.name("form_note_type")));
		selectType.selectByVisibleText("Pharmacy");
		
		Select selectName=new Select(driver.findElement(By.id("users")));
		selectName.selectByIndex(1);
		
		driver.findElement(By.id("newnote")).click();
		
		String text=driver.findElement(By.xpath("//span[contains(text(),'choose')]")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.quit();
	}

}


