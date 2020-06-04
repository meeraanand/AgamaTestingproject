package com.homework;

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

public class WrapperMethods {

	WebDriver driver;

	public void insertapp(String url) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/meera/Downloads/chromedriver_latest/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	public void enterbyid(String val,String name){
		driver.findElement(By.id(val)).sendKeys(name);
	}
	
	public void clickbyxpath(String val1){
		driver.findElement(By.xpath(val1)).click();
	}
	public void clickbylinktext(String val2){
		driver.findElement(By.xpath(val2)).click();
	}
	public void closeapp(){
		driver.close();
		
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
	public void selectdropdown(String text){
		Select userRole = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		userRole.selectByVisibleText(text);
	}
	public void selectdropdown1(String text){
		Select userStatus = new Select(driver.findElement(By.id("searchSystemUser_status")));
		userStatus.selectByVisibleText(text);
	}
	

}
