package com.voya.test;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1Test {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("testdata/OpenEMRTestData.xlsx"); // location

		XSSFWorkbook book = new XSSFWorkbook(file); // open

		XSSFSheet sheet = book.getSheet("invalidCredentialTest"); //sheet
		
		XSSFCell cell =  sheet.getRow(0).getCell(0);  //row //cell
		
		String value = cell.getStringCellValue();
		
		System.out.println(value);

	}

}
