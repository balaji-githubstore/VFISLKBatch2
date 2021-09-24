package com.voya.test;

import org.testng.annotations.Test;

import com.voya.base.WebDriverWrapper;
import com.voya.pages.LoginPage;

public class AboutTest extends WebDriverWrapper {
	
	@Test
	public void aboutHeaderAndVersionTest()
	{
		LoginPage.enterUsername(driver, "admin");
	}

}
