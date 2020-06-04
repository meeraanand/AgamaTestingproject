package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginTest_IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "C:/Users/meera/Downloads/IEDriverServer_x64_3.150.1/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		//launching the browser
		driver.get("https://opensource-demo.orangehrmlive.com");
		//get the title of the page
		System.out.println("The title of the page is" + driver.getTitle());
		//close the page
		driver.close();
		

	}

}
