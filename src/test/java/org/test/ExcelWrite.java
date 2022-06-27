package org.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
         File f = new File("C:\\Users\\shiva\\eclipse-workspace\\FrameWrok\\ExcelData\\ExcelWrite.xlsx");
         Workbook w = new XSSFWorkbook();
         Sheet s = w.createSheet("Data");
         Row row = s.createRow(3);
         Cell c = row.createCell(3);
         c.setCellValue("AATHU");
         FileOutputStream fout=new FileOutputStream(f);
         w.write(fout);
         System.out.println("done");
         
         
         
	}

}
