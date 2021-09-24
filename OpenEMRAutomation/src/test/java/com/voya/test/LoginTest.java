package com.voya.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.voya.base.WebDriverWrapper;
import com.voya.pages.DashboardPage;
import com.voya.pages.LoginPage;
import com.voya.utilities.DataProviderUtils;

	
public class LoginTest extends WebDriverWrapper  {
	
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
		
		Reporter.log("actual title check");
		
		Assert.assertEquals(actualTitle, "OpenEMR Login");
	}

	@Test
	public void checkApplicationDescTest()
	{
		String actualDesc=LoginPage.getApplicationDescription(driver);
		Assert.assertEquals(actualDesc.trim(), "The most popular open-source Electronic Health Record and Medical Practice Management solution.");
	}
}

