package com.voya.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Demo4Test {

	public static void main(String[] args) throws IOException   {

		FileInputStream file = new FileInputStream("testdata/OpenEMRTestData.xlsx"); // location 

		XSSFWorkbook book = new XSSFWorkbook(file); // open

		XSSFSheet sheet = book.getSheet("invalidCredentialTest"); //sheet
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] main=new String[rowCount-1][cellCount];
		
		for(int r=1;r<rowCount;r++)
		{
			for(int c=0;c<cellCount;c++)
			{
				XSSFCell cell =  sheet.getRow(r).getCell(c);  //row //cell
				
				DataFormatter format=new DataFormatter();
				String value = format.formatCellValue(cell);
				System.out.println(value);
				main[r-1][c]=value ;
			}
		}
		
		System.out.println("end---");
	}
}




