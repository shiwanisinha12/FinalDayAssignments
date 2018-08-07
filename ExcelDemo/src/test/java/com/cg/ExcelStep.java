package com.cg;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelStep {
	String file="D:\\readingexcel.xlsx";
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shiwansi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("D:\\BDD\\ExcelDemo\\src\\main\\webapp\\excel.html");
	}
	
	@Given("^I am sending details")
	public void sendDetails() throws Throwable 
	{
		FileInputStream fs=new FileInputStream(file);
		//String cell[][] = null;
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheetAt(0);
		//int col=sheet.getPhysicalNumberOfRows();
		int row=sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println(col);

		for(int i=0;i<row;i++)
		{
			
				String Fname=sheet.getRow(i).getCell(0).toString();
				String Lname=sheet.getRow(i).getCell(1).toString();
				String city =sheet.getRow(i).getCell(2).toString();
				
				System.out.println(Fname);
				driver.findElement(By.id("fname")).sendKeys(Fname);
				  Thread.sleep(1000);
				  driver.findElement(By.id("lname")).sendKeys(Lname);
				  Thread.sleep(1000);
				  driver.findElement(By.id("city")).sendKeys(city);
				  Thread.sleep(1000);
				  driver.findElement(By.id("btn")).click();
				  Thread.sleep(1000);
				  driver.switchTo().alert().accept();
				  Thread.sleep(1000);
	
			
		
			
		
	}
}
}