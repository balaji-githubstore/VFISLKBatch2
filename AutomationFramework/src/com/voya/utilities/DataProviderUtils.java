package com.voya.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {
	
	@DataProvider
	public String[][] invalidCredentialData() throws IOException
	{
		String[][] main = ExcelUtils.getSelectedRowIntoArray("testdata/OpenEmrTestData.xlsx", "invalidCredentialTestCount");
		return main;
	}

	@DataProvider
	public String[][] validCredentialData() {
		String[][] main = new String[3][4];

		main[0][0] = "admin";
		main[0][1] = "pass";
		main[0][2] = "English (Indian)";
		main[0][3] = "OpenEMR";

		main[1][0] = "physician";
		main[1][1] = "physician";
		main[1][2] = "English (Indian)";
		main[1][3] = "OpenEMR";

		main[2][0] = "accountant";
		main[2][1] = "accountant";
		main[2][2] = "English (Indian)";
		main[2][3] = "OpenEMR";

		return main;
	}

//	@DataProvider
//	public String[][] invalidCredentialData()
//	{
//		String[][] main = new String[2][4];
//
//		main[0][0] = "admin12";
//		main[0][1] = "pass";
//		main[0][2] = "English (Indian)";
//		main[0][3] = "Invalid username or password";
//
//		main[1][0] = "physician12";
//		main[1][1] = "physician";
//		main[1][2] = "English (Indian)";
//		main[1][3] = "Invalid username or password";
//		
//		return main;
//	}
}
