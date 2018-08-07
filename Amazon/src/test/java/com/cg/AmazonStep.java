package com.cg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class AmazonStep {

WebDriver driver=null;
AmazonPom page;
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shiwansi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		page=PageFactory.initElements(driver, AmazonPom.class);
	}
	
	@Given("^I want to order products")
	public void orderProducts() throws Throwable
	{
		Thread.sleep(5000);
		driver.manage().window().maximize();
		page.searchBox.sendKeys("tops");
		page.clickSearch.click();
		page.view1.click();
		page.selectSize.click();
		Thread.sleep(1000);
		page.add.click();
		
		page.view2.click();
		page.add.click();
		
		page.view3.click();
		page.selectSize.click();
		page.add.click();
		
		page.searchBox.sendKeys("earphones");
		page.clickSearch.click();
		page.view4.click();
		page.add.click();
		
		page.proceed.click();
		
	}
	
}
