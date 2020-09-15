package com.homework.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng_hw {
	WebDriver driver;
	public int waitTime=60;
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		if(browserName.equalsIgnoreCase("facebook")){
			driver.get("https://www.facebook.com/");
		}
		else if (browserName.equalsIgnoreCase("gmail")){
			driver.get("http://www.gmail.com");
		}
		driver.wait(60);
		
	}
	
	@Test
	
	public void facebook(){
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("aaaa");
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		  //driver.wait().waitUntilVisibilityOfElementLocatedBy("id", facebook.g());	
	}
	
	
	
	@AfterTest
	public void teardown(){
		driver.close();
	
	}
	
	

}