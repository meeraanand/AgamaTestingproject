package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest_Firefox1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/meera/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//launching the browser
		driver.get("https://www.facebook.com");
		//get the title of the page
		System.out.println("The title of the page is" + driver.getTitle());
		//close the page
		driver.close();
		

	}

}
