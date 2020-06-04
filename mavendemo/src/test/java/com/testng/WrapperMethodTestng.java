package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrapperMethodTestng {

	WebDriver driver;
	

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@Test
	public void SignUp() {
		// driver.findElement(By.id)
	}

	public void Admin() {

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
