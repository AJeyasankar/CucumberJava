 package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenPractical {
	public static void main(String[] args) throws IOException {
		//To create the new location with new file
		File f = new File("D:\\Selenium Practical\\New folder\\DDpractical.xlsx");
		FileInputStream stream = new FileInputStream(f);
		//To define the Excell Format
		Workbook book = new XSSFWorkbook(stream);
		//To get the sheet from the Excell
		Sheet sheet = book.getSheet("Students Details");
		//To create new row and mention which index
		Row cr15 = sheet.createRow(15);
		//To create new cell and mention which index
		Cell cc31 = cr15.createCell(2);
		Cell cc32 = cr15.createCell(3);
		//To set value on required cell
		cc31.setCellValue("Manoj");
		cc32.setCellValue("Civil");
		
		FileOutputStream stream1 = new FileOutputStream(f);
		book.write(stream1);
		
//		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//			Row row = sheet.getRow(i);
//			
//			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//				Cell cell = row.getCell(j);
//				String stringcellvalue = cell.getStringCellValue();
//						System.out.println(stringcellvalue);
//			}
//		}
//			
		
	}
}
		
	





//TO get the total number of rows and cells
//for(int i=1; i<sheet.getPhysicalNumberOfRows();i++) {
//	Row row = sheet.getRow(i);
//
//	for(int j=0; j<row.getPhysicalNumberOfCells();j++) {
//		Cell cell = row.getCell(j);
//		
//		String stringcellvalue = cell.getStringCellValue();
//		System.out.println(stringcellvalue);
//
//	}
//	System.out.println();
//}

		
		
		
		//		//To set the workbook
//		Workbook book = new XSSFWorkbook();
//		//To create the new sheet
//		Sheet sheet = book.createSheet("Students Details");
//		//To create the row and mention which index
// 		Row cr0 = sheet.createRow(0);
//		Row cr1 = sheet.createRow(1);
//		Row cr2 = sheet.createRow(2);
//		Row cr3 = sheet.createRow(3);
//		Row cr4 = sheet.createRow(4);
//		Row cr5 = sheet.createRow(5);
//		Row cr6 = sheet.createRow(6);
//		Row cr7 = sheet.createRow(7);
//		Row cr8 = sheet.createRow(8);
//		Row cr9 = sheet.createRow(9);
//		Row cr10 = sheet.createRow(10);
//		//To create the cell and mention which index
//		Cell cc0 = cr0.createCell(0);
//		Cell cc1 = cr0.createCell(1);
//		Cell cc2 = cr1.createCell(0);
//		Cell cc3 = cr1.createCell(1);
//		Cell cc4 = cr2.createCell(0);
//		Cell cc5 = cr2.createCell(1);
//		Cell cc6 = cr3.createCell(0);
//		Cell cc7 = cr3.createCell(1);
//		Cell cc8 = cr4.createCell(0);
//		Cell cc9 = cr4.createCell(1);
//		Cell cc10 = cr5.createCell(0);
//		Cell cc11 = cr5.createCell(1);
//		Cell cc12 = cr6.createCell(0);
//		Cell cc13 = cr6.createCell(1);
//		Cell cc14 = cr7.createCell(0);
//		Cell cc15 = cr7.createCell(1);
//		Cell cc16 = cr8.createCell(0);
//		Cell cc17 = cr8.createCell(1);
//		Cell cc18 = cr9.createCell(0);
//		Cell cc19 = cr9.createCell(1);
//		Cell cc20 = cr10.createCell(0);
//		Cell cc21 = cr10.createCell(1);
//		
//		//To set the value on required cell
//		cc0.setCellValue("NAME");
//		cc1.setCellValue("Course");
//		cc2.setCellValue("Kathir");
//		cc3.setCellValue("CSE");
//		cc4.setCellValue("Ravi");
//		cc5.setCellValue("EEE");
//		cc6.setCellValue("Kayathiri");
//		cc7.setCellValue("IT");
//		cc8.setCellValue("Mohan");
//		cc9.setCellValue("Mech");
//		cc10.setCellValue("Manish");
//		cc11.setCellValue("Aero");
//		cc12.setCellValue("Kavi");
//		cc13.setCellValue("CSE");
//		cc14.setCellValue("Mari");
//		cc15.setCellValue("Mech");
//		cc16.setCellValue("Balaji");
//		cc17.setCellValue("MCA");
//		cc18.setCellValue("Surya");
//		cc19.setCellValue("ECE");
//		cc20.setCellValue("Kamali");
//		cc21.setCellValue("ECE");
//		
//		
//		FileOutputStream stream = new FileOutputStream(f);
//		book.write(stream);
//
//	}
//}
//
