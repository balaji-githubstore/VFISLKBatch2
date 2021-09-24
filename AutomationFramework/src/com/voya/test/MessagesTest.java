package com.voya.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.voya.base.WebDriverWrapper;
import com.voya.pages.DashboardPage;
import com.voya.pages.LoginPage;
import com.voya.pages.MessageCenterPage;
import com.voya.utilities.DataProviderUtils;

public class MessagesTest extends WebDriverWrapper {
	
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


