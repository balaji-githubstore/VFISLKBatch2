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

import com.voya.pages.DashboardPage;
import com.voya.pages.LoginPage;
import com.voya.utilities.DataProviderUtils;




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
	
	@Test(dataProviderClass = DataProviderUtils.class,dataProvider = "invalidCredentialData")
	public void invalidCredentialTest(String username,String password,String language,String expectedValue)
	{
		LoginPage.enterUsername(driver, username);
		LoginPage.enterPassword(driver, password);
		LoginPage.selectLanguage(driver, language);
		LoginPage.clickOnLogin(driver);
				
		String actualValue= LoginPage.getInvalidErrorMessage(driver);
			
		Assert.assertEquals(actualValue.trim(), expectedValue);
	}
	
	@Test(dataProviderClass = DataProviderUtils.class,dataProvider = "validCredentialData")
	public void validCredentialTest(String username,String password,String language,String expectedValue)
	{	
		LoginPage.enterUsername(driver, username);
		LoginPage.enterPassword(driver, password);		
		LoginPage.selectLanguage(driver, language);
		LoginPage.clickOnLogin(driver);
		
		String actualValue= DashboardPage.getDashboardPageTitle(driver);
		System.out.println(actualValue);		
		Assert.assertEquals(actualValue,expectedValue);
	}
	
	@Test
	public void checkLoginPageTitleTest()
	{
		LoginPage.waitForPresenceOfUsernameElement(driver);		
		String actualTitle= LoginPage.getLoginPageTitle(driver);
		Assert.assertEquals(actualTitle, "OpenEMR Login");
	}

	@Test
	public void checkApplicationDescTest()
	{
		String actualDesc=LoginPage.getApplicationDescription(driver);
		Assert.assertEquals(actualDesc.trim(), "The most popular open-source Electronic Health Record and Medical Practice Management solution.");
	}
}

