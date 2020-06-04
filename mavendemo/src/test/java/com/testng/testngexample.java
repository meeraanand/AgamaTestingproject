package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testngexample {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setup(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
	}
	@BeforeMethod
	public void openBrowser(){
		//driver.get("https://www.google.com");
		
		
		
	}
	@Test
	public void login(){
	driver.findElement(By.id("Admin"));
	driver.findElement(By.id("admin123"));
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	
	}
	
	@AfterMethod
	public void postlogout(){
		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void quit(){
		
	}
	
	
	
	

}
