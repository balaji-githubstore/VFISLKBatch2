package com.voya.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Demo2Test {

	public static void main(String[] args) throws IOException   {

		FileInputStream file = new FileInputStream("testdata/OpenEMRTestData.xlsx"); // location 

		XSSFWorkbook book = new XSSFWorkbook(file); // open

		XSSFSheet sheet = book.getSheet("invalidCredentialTest"); //sheet
		
		XSSFCell cell =  sheet.getRow(0).getCell(0);  //row //cell
		
		DataFormatter format=new DataFormatter();
		String value = format.formatCellValue(cell);
		
		System.out.println(value);
		
		

	}
}