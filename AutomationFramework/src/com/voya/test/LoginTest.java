package com.voya.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.voya.pages.LoginPage;





public class LoginTest {
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		driver.get("https://demo.openemr.io/b/openemr");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@Test
	public void invalidCredentialTest()
	{
		LoginPage.enterUsername(driver, "admin123");
		LoginPage.enterPassword(driver, "pass");
		LoginPage.selectLanguage(driver, "English (Indian)");
		LoginPage.clickOnLogin(driver);
				
		String actualValue= LoginPage.getInvalidErrorMessage(driver);
			
		Assert.assertEquals(actualValue.trim(), "Invalid username or password");
	}
	
	@Test
	public void validCredentialTest()
	{	
		LoginPage.enterUsername(driver, "admin");
		LoginPage.enterPassword(driver, "pass");		
		
		Select selectLanguage=new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Indian)");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String actualValue= driver.getTitle();
		System.out.println(actualValue);		
		Assert.assertEquals(actualValue,"OpenEMR");
	}
	
	@Test
	public void checkLoginPageTitleTest()
	{
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("authUser")));
		
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, "OpenEMR Login");
	}

	@Test
	public void checkApplicationDescTest()
	{
		String actualDesc=driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
		Assert.assertEquals(actualDesc.trim(), "The most popular open-source Electronic Health Record and Medical Practice Management solution.");
	}
}

