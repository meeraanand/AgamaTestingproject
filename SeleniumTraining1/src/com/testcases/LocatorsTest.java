package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/meera/Downloads/chromedriver_latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//1.id 
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("meera123");
		//2.xpath
		//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();	
		//3.linkText
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		//4.partiallinkText
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		//relative xpath
		//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		//absolute xpath
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
		//And condition
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("aaaa");
		//Or condition
		driver.findElement(By.xpath("//input[@name='lastname' or @id='u_0_s']")).sendKeys("bbbb");	
		//contains
		driver.findElement(By.xpath("//*[contains(@name,'reg_email__')]")).sendKeys("11111");
		//startswith
		driver.findElement(By.xpath("//*[starts-with(@name,'reg_p')]")).sendKeys("ddddd");
		
		
		
		
		
		

	}

}
