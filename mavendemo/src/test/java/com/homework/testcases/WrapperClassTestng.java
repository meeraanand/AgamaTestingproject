package com.homework.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrapperClassTestng {
	
	WebDriver driver;
	WrapperMethodTestng wm = new WrapperMethodTestng();
	

	
	@BeforeTest
	public void insertapp(){
		wm.insertapp("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=1)
	public void Login(){
		wm.enterbyid("txtUsername", "Admin");
		wm.enterbyid("txtPassword", "admin123");
		wm.clickbyxpath("//*[@id='btnLogin']");
	}
	@Test(priority=2)
	public void Admin() throws IOException, InterruptedException{
		wm.clickbylinktext("Admin");
		Thread.sleep(1000);
		wm.enterbyid("searchSystemUser_userName", "meera");
		wm.selectdropdown1("searchSystemUser_userType","Admin");
		wm.enterbyid("searchSystemUser_employeeName_empName", "meeraanand");
		wm.selectdropdown1("searchSystemUser_status", "Enabled");
		wm.clickbyxpath("//*[@id='searchBtn']");
		wm.takesnap("C:/Users/meera/pictures/session3.png");
		
		
		
	}
	@AfterTest
	public void closeapp(){
		//driver.quit();
	}
	
	

}
