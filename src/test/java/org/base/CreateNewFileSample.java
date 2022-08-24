package org.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateNewFileSample {
	public static void main(String[] args) throws IOException {


		//To create the new location with new file
		File f = new File("D:\\Selenium Practical\\New folder\\creatnew.xlsx");
		//to set the Workbook
		Workbook book = new XSSFWorkbook();
		//To create the new sheet
		Sheet createSheet = book.createSheet("Testing");
		//To create row and mention which index
		Row createRow0 = createSheet.createRow(0);
		Row createRow1 = createSheet.createRow(1);
		Row createRow2 = createSheet.createRow(2);
		Row cr3 = createSheet.createRow(3);
		
		//To create the new cell and mention which index
		Cell createCell0 = createRow0.createCell(0);
		Cell createCell1 = createRow0.createCell(1);
		Cell createCell2 = createRow0.createCell(2);
		
		
		Cell createCell4 = createRow1.createCell(0);
		Cell createCell5 = createRow1.createCell(1);
		Cell createCell6 = createRow1.createCell(2);

		Cell createCell7 = createRow2.createCell(0);
		Cell createCell8 = createRow2.createCell(1);
	 	Cell createCell9 = createRow2.createCell(2);
	 	
	 	Cell cc10 = cr3.createCell(0);
	 	Cell cc11 = cr3.createCell(1);
	 	Cell cc12 = cr3.createCell(2);
		//To set the value on required cell
		createCell0.setCellValue("NAME");
		createCell1.setCellValue("DEPT");
		createCell2.setCellValue("COLLEGE");

		createCell4.setCellValue("Kavi");
		createCell5.setCellValue("English");
		createCell6.setCellValue("Ambika college");

		createCell7.setCellValue("Manisha Che");
		createCell8.setCellValue("English");
		createCell9.setCellValue("Meenakshi college");

		cc10.setCellValue("Dura");
		cc11.setCellValue("Chemistry");
		cc12.setCellValue("Zakir Hussain college");

		FileOutputStream stream = new FileOutputStream(f);
		book.write(stream);

		//To get the sheet from the book
		Sheet sheet = book.getSheet("Testing");

		for(int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);

			for(int j=0; j<row.getPhysicalNumberOfCells();j++) {

				Cell cell = row.getCell(j);

				String stringcellvalue = cell.getStringCellValue();

				if(stringcellvalue.equals("kavi")){
					cell.setCellValue("ma");
					FileOutputStream out = new FileOutputStream(f);
					book.write(out);
				}
				//String stringcellvalue2 = cell.getStringCellValue();
				System.out.println(stringcellvalue);
  
			}
		System.out.println();
		}


	}
}
