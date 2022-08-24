package org.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginUsingList {
public static void main(String[] args) throws IOException {
	List<String> li = new LinkedList();
	li.add("jack67@gmail.com");
	li.add("john34@gmail.com");
	li.add("karthi23@gmail.com");
	li.add("kate087@gmail.com");
	
	
	List<String> l2 = new LinkedList();
	l2.add("hsdicuas6r87");
	l2.add("7032Der");
	l2.add("Lakds01982");
	l2.add("pqeur53!");
	
	File f = new File("D:\\Selenium Practical\\New folder\\ListCreation\\login.xlsx");
	Workbook book = new XSSFWorkbook();
	Sheet sheet = book.createSheet("Login Details");
	for (int i = 0; i < li.size(); i++) {
		sheet.createRow(i).createCell(0).setCellValue(li.get(i));
		sheet.getRow(i).createCell(1).setCellValue(l2.get(i));
		FileOutputStream out = new FileOutputStream(f);
		book.write(out); 
	}
}
}
