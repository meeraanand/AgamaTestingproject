package com.homework.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrapperMethodLogin {
	
	WebDriver driver;
	public void insertapp(String url) {
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/meera/Downloads/chromedriver_latest/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com"
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
	}

	public void enterbyid(String val, String name) {
		driver.findElement(By.id(val)).sendKeys(name);
		
	}

	public void clickbyxpath(String val1) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(val1)).click();
			
	}
	public void clickbylinktext(String val2){
		driver.findElement(By.linkText(val2)).click();
	}
	public void checkbox(String val3){
		WebElement option1 = driver.findElement(By.id(val3));									
        option1.click();
	}
	public void selectdropdown(String text){
		Select userRole = new Select(driver.findElement(By.id("status")));
		userRole.selectByVisibleText(text);
	}
	public void selectdropdown2(String text){
		Select userRole1 = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		userRole1.selectByVisibleText(text);
	}
	public void takesnap(String path) throws IOException{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot ts = ((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File source = ts.getScreenshotAs(OutputType.FILE);
		//Copy file to Desired Location
		FileUtils.copyFile(source,new File(path));
		//TakeScreenshot TakesScreenshot scrShot =((TakesScreenshot)driver);
		
	}

	
	

}
