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
		
		//create string[][]
		String[][] main=new String[2][4];
		
		for(int r=1;r<3;r++)
		{
			for(int c=0;c<4;c++)
			{
				XSSFCell cell =  sheet.getRow(r).getCell(c);  //row //cell
				
				DataFormatter format=new DataFormatter();
				String value = format.formatCellValue(cell);
				System.out.println(value);
				//load the cell value to string[][] 
				
			}
			System.out.println("---------------------------");
		}
		
	}
}




