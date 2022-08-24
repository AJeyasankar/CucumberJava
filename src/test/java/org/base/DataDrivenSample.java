package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenSample {
	public static void main(String[] args) throws IOException {
		//To locate the file
		File f = new File("D:\\Airtel\\jeyasankar january2022 projection.xlsx");
		FileInputStream stream = new FileInputStream(f);
		//To define Excel format
		Workbook book = new XSSFWorkbook(stream);
		//To get the sheet from the book
		Sheet sheet = book.getSheet("Sheet2");
		//To get the row from the sheet
		//		Row row = sheet.getRow(3);
		//		//To get the cell from the Row
		//		Cell cell = row.getCell(3);
		//		//To get the value from the cell
		//		String stringCellValue = cell.getStringCellValue();
		//		System.out.println(stringCellValue);

		//To print the value from the Excel
		for(int i=5; i<sheet.getPhysicalNumberOfRows();i++) {
			Row row = sheet.getRow(i);
			for(int j=1; j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				String stringcellvalue = cell.getStringCellValue();
				System.out.println(stringcellvalue);
			}
		}






	}
}
