package com.voya.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.voya.pages.DashboardPage;
import com.voya.pages.LoginPage;
import com.voya.pages.MessageCenterPage;

public class MessagesTest {
	
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
	public void patientErrorMessageTest()
	{
		LoginPage.enterUsername(driver, "admin");
		LoginPage.enterPassword(driver, "pass");
		LoginPage.selectLanguage(driver, "English (Indian)");
		LoginPage.clickOnLogin(driver);
		
		DashboardPage.clickOnMessages(driver);
		
		MessageCenterPage.switchToMsgFrame(driver);
		MessageCenterPage.clickOnAddNew(driver);
		MessageCenterPage.typeMessage(driver, "please book an appointment.");
		MessageCenterPage.selectType(driver, "Pharmacy");
		MessageCenterPage.selectUserByIndex(driver, 1);
		MessageCenterPage.clickOnSendMessage(driver);
		String actualText=MessageCenterPage.getPatientErrorMessage(driver);
		MessageCenterPage.switchOutOfFrame(driver);
		
		Assert.assertEquals(actualText, "Please choose a patient");
		
	}

}


