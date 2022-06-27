package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead {

	public static void main(String[] args) throws IOException {
       File f = new File("C:\\Users\\shiva\\eclipse-workspace\\FrameWrok\\ExcelData\\ram.xlsx");
       FileInputStream fIn=new FileInputStream(f);
       Workbook w = new XSSFWorkbook(fIn);
       Sheet s = w.getSheet("Sheet1");
       Row r = s.getRow(1);
       Cell c = r.getCell(1);
      // System.out.println(c);
      String value = c.getStringCellValue();  // update the value
      if (value.equals("MCA")) 
      {
		c.setCellValue("Java");
		
	}
      FileOutputStream fOut=new FileOutputStream(f);
      w.write(fOut);
      System.out.println("done");
       
	}		   
	}
