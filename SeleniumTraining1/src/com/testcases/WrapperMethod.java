package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrapperMethod {
	WebDriver driver;
	public void insertapp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/meera/Downloads/chromedriver_latest/chromedriver.exe");
		 driver = new ChromeDriver();
		 //
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get(url);
		
		
	}
	public void enterbyId(String val,String name){
		driver.findElement(By.id(val)).sendKeys(name);
		
	}
	
	public void clickByXpath(String val1){
		driver.findElement(By.xpath(val1)).click();
		
	}
	public void closeapp(){
		
	}
	
	
	

	
}
