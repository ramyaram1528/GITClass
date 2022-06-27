package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AdactinHotel {

	public static void main(String[] args) throws IOException {
       File hotelLoc = new File("C:\\Users\\shiva\\eclipse-workspace\\FrameWrok\\ExcelData\\adactin hotel.xlsx");
       FileInputStream fIn = new FileInputStream(hotelLoc);
       Workbook w = new XSSFWorkbook(fIn);
       Sheet s = w.getSheet("Hotel");
       for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
    	   Row r = s.getRow(i);
    	   for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
    		   Cell c = r.getCell(j);
    		 //  System.out.println(c);
    		   int type = c.getCellType();
    		   if(type==1)
    		   {
    			   String sValue = c.getStringCellValue();
    			   System.out.println(sValue);
    		   }
    		   else if(type==0)
    		   {
    			  if(DateUtil.isCellDateFormatted(c))
    			  {
    				  Date date = c.getDateCellValue();
    				  SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
    				  String dValue=sdf.format(date);
    				  System.out.println(dValue);
    			  }
    			  else
    			  {
    				  double d = c.getNumericCellValue();
    				  long l = (long)d;
    				  String nValue=String.valueOf(l);
    				  System.out.println(nValue);
    			  }
    		   }     		   
		}	
	}
    }
}
