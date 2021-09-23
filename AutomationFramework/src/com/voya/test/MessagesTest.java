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
import com.voya.utilities.DataProviderUtils;

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
	
	@Test(dataProviderClass = DataProviderUtils.class,dataProvider = "patientErrorMessageData")
	public void patientErrorMessageTest(String username,String password,String language,String message,String type,String user,String expectedValue)
	{
		LoginPage.enterUsername(driver, username);
		LoginPage.enterPassword(driver, password);
		LoginPage.selectLanguage(driver, language);
		LoginPage.clickOnLogin(driver);
		
		DashboardPage.clickOnMessages(driver);
		
		MessageCenterPage.switchToMsgFrame(driver);
		MessageCenterPage.clickOnAddNew(driver);
		MessageCenterPage.typeMessage(driver, message);
		MessageCenterPage.selectType(driver, type);
		
		int index=Integer.parseInt(user);
		MessageCenterPage.selectUserByIndex(driver, index);
		
		MessageCenterPage.clickOnSendMessage(driver);
		String actualText=MessageCenterPage.getPatientErrorMessage(driver);
		MessageCenterPage.switchOutOfFrame(driver);
		
		Assert.assertEquals(actualText, expectedValue);
		
	}
}


