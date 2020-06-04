package com.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:/Users/meera/Downloads/chromedriver_latest/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		 driver.findElement(By.xpath("//input[@type='text' and @name='q']")).sendKeys("testing");
		 String typedText = driver.findElement(By.xpath("//input[@type='text' and @name='q']")).getAttribute("value");
		 System.out.println(typedText);
		 driver.findElement(By.name("btnK")).click();

	}

}
