package Assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import java.lang.reflect.Method; 

public class ExcelAssignment1 {
  @Test (enabled=false)
  public void CreateSheets () throws IOException {
	  FileInputStream fis= new FileInputStream("D:\\software testing\\AutomationWorkspace\\Maven-May18\\src\\test\\resources\\AppData\\PracticeAssignment1.xlsx");
	  Workbook workbook = new XSSFWorkbook(fis);
	  workbook.createSheet("Data 1");
	  workbook.createSheet("Data 2");
	  workbook.createSheet("Data 3");
	  workbook.createSheet("Data 4");
	  workbook.createSheet("Data 5");
	  
	  
	  FileOutputStream fos= new FileOutputStream("D:\\software testing\\AutomationWorkspace\\Maven-May18\\src\\test\\resources\\AppData\\PracticeAssignment1.xlsx");
	  workbook.write(fos);
	  fos.close();
	  
  }
  
  @Test (priority=1)
  public static void AddDataToSheet() throws IOException {
	  FileInputStream fis= new FileInputStream("D:\\software testing\\AutomationWorkspace\\Maven-May18\\src\\test\\resources\\AppData\\PracticeAssignment1.xlsx");
	  Workbook workbook= new XSSFWorkbook(fis);
	  int sheetCount=workbook.getNumberOfSheets();
	  System.out.println("Number of sheets in file are: "+sheetCount);
	  for (int i=0; i<sheetCount; i++) {
		  System.out.println("Sheet name is : "+workbook.getSheetName(i));
	  }
	  //workbook.removeSheetAt(2);
	  
	 // Sheet sheet= workbook.getSheet("Data 1");
	  Sheet sheet= workbook.getSheet("Sheet1");
	  Row row= sheet.getRow(0);
	  Cell addCell1=row.createCell(0);
	  addCell1.setCellValue("URL");
	  Cell addCell2=row.createCell(1);
	  addCell2.setCellValue("Username");
	  Cell addCell3=row.createCell(2);
	  addCell3.setCellValue("Password");
	  Cell addCell4=row.createCell(3);
	  addCell4.setCellValue("Expected Result");
	  Cell addCell5=row.createCell(4);
	  addCell5.setCellValue("Actual  Result");
	  
	  FileOutputStream fos= new FileOutputStream("D:\\software testing\\AutomationWorkspace\\Maven-May18\\src\\test\\resources\\AppData\\PracticeAssignment1.xlsx");
	  workbook.write(fos);
	  fos.close();
  }
	  
 @Test (priority=2)
  public static void AddDataToRow1() throws IOException {
	  FileInputStream fis= new FileInputStream("D:\\software testing\\AutomationWorkspace\\Maven-May18\\src\\test\\resources\\AppData\\PracticeAssignment1.xlsx");
	  Workbook workbook= new XSSFWorkbook(fis);
	  Sheet sheet= workbook.getSheet("Sheet1");
	  Row row= sheet.getRow(1);
	  Cell addCell11=row.createCell(0);
	  addCell11.setCellValue("www.google.com");
	  Cell addCell12=row.createCell(1);
	  addCell12.setCellValue("Sameer");
	  Cell addCell13=row.createCell(2);
	  addCell13.setCellValue("Sameer@123");
	  Cell addCell14=row.createCell(3);
	  addCell14.setCellValue("passed");
	  Cell addCell15=row.createCell(4);
	  addCell15.setCellValue("passed");
	  
	  FileOutputStream fos1= new FileOutputStream("D:\\software testing\\AutomationWorkspace\\Maven-May18\\src\\test\\resources\\AppData\\PracticeAssignment1.xlsx");
	  workbook.write(fos1);
	  fos1.close();
  }
  
 @Test (priority=3)
 public static void AddDataToRow2() throws IOException {
	  FileInputStream fis= new FileInputStream("D:\\software testing\\AutomationWorkspace\\Maven-May18\\src\\test\\resources\\AppData\\PracticeAssignment1.xlsx");
	  Workbook workbook= new XSSFWorkbook(fis);
	  Sheet sheet= workbook.getSheet("Sheet1");
	  Row row3=sheet.createRow(2);
	  //Row row= sheet.getRow(2);
	  Cell addCell1=row3.createCell(0);
	  addCell1.setCellValue("www.facebook.com");
	  Cell addCell2=row3.createCell(1);
	  addCell2.setCellValue("Jayendra");
	  Cell addCell3=row3.createCell(2);
	  addCell3.setCellValue("Jay@123");
	  Cell addCell4=row3.createCell(3);
	  addCell4.setCellValue("Passed");
	  Cell addCell5=row3.createCell(4);
	  addCell5.setCellValue("Failed");
	  
	  FileOutputStream fos2= new FileOutputStream("D:\\software testing\\AutomationWorkspace\\Maven-May18\\src\\test\\resources\\AppData\\PracticeAssignment1.xlsx");
	  workbook.write(fos2);
	  fos2.close();
 }
  
  
  
  
}
