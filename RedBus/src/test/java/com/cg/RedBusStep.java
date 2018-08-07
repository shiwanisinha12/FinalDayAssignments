package com.cg;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class RedBusStep {

	WebDriver driver=null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shiwansi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		/*ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		  System.setProperty("webdriver.chrome.driver","D:\\Users\\shiwansi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver(options);
		 */
		driver.get("https://www.redbus.in/");
	}
	
	@Given("^I am opening redbus page$")
	public void bookTickets() throws Throwable {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Pune");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")).click();//*[@id="search"]/div/div[1]/div/ul/li[5]
		//Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("Nagpur");//*[@id="search"]/div/div[2]/div/ul/li
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		//Thread.sleep(1000);
		WebElement element3=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[3]/td[6]"));
		assertEquals("1", element3.getText());
		element3.click();
	
		
		  driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"10334082\"]/div/div[2]/div[1]")).click();
		//Thread.sleep(2000);
		 // driver.findElement(By.xpath("//*[@id=\"10469496\"]/div/div[2]/div[1]")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		 driver.findElement(By.xpath("//*[@id=\"10334082\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"10334082\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]/span[2]")).click();
		  driver.findElement(By.xpath("//*[@id=\"10334082\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"seatno-04\"]")).sendKeys("Shiwani");
		driver.findElement(By.xpath("//*[@id=\"23_0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"seatno-01\"]")).sendKeys("25");
		driver.findElement(By.xpath("//*[@id=\"seatno-05\"]")).sendKeys("shiwani12@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"seatno-06\"]")).sendKeys("9065112233");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")).click();
	}
		
	
}
