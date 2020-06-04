package com.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange_LoginTest {
	public static void main(String args[]){
	
	System.setProperty("webdriver.chrome.driver","C:/Users/meera/Downloads/chromedriver_latest/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	//id
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	//xpath
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	//linktext
	driver.findElement(By.linkText("Admin")).click();
	
	
	//and
	driver.findElement(By.xpath("//input[@type='text' and @name='searchSystemUser[userName]']")).sendKeys("meeraanand");
	//name 
	Select userRole = new Select(driver.findElement(By.name("searchSystemUser[userType]")));
	userRole.selectByVisibleText("Admin");
	//contains
	driver.findElement(By.xpath("//*[contains(@name,'searchSystemUser[employeeName][empName]')]")).sendKeys("meera");
	Select userStatus = new Select(driver.findElement(By.name("searchSystemUser[status]")));
	userStatus.selectByVisibleText("Enabled");
	
	driver.findElement(By.xpath("//*[starts-with(@name,'_sea')]")).click();
	//cssselector
	driver.findElement(By.cssSelector("#resetBtn")).click();
	}
	

}
