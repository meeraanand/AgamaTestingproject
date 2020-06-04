package com.homework.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeLogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		//https://opensource-demo.orangehrmlive.com/
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//xpath
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		//linktext
		driver.findElement(By.linkText("PIM")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='btnAdd']")).click();
		//*[@id="btnAdd"]
		Thread.sleep(2000);

	}

}
