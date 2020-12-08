package com.excelReading.SptemberBatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class ExcelDataReadingBycolumn {
	

	public static void main(String[] args) throws IOException
	{
       FileInputStream fis = new FileInputStream("C:\\Users\\pilla\\OneDrive\\Documents\\test.xlsx");
	
       XSSFWorkbook wb=new XSSFWorkbook(fis);
       XSSFSheet sheet  =wb.getSheet("login");
       XSSFRow row =sheet.getRow(3);
       XSSFCell cell =row.getCell(1);
       String val =cell.getStringCellValue(); 
    		      System.out.println(val);
    		      wb.close();
    		      fis.close();
    		      
    		}

    		}

       

