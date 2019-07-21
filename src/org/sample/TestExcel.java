package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcel {
	public static void main(String[] args) throws IOException{
		//file loc
		File loc=new File("D:\\Java\\Java\\Selenium\\Excel\\userdetails.xlsx");
		//convert to object
		FileInputStream stream=new FileInputStream(loc);
		//workbook
		Workbook w=new XSSFWorkbook(stream);
		//sheet
		Sheet s = w.getSheet("Sheet1");
		int count=s.getPhysicalNumberOfRows();
		System.out.println(count);
	    //row
		Row r = s.getRow(1);
		//cell
        Cell c=r.getCell(0);
		System.out.println(c);
		
	}

}
