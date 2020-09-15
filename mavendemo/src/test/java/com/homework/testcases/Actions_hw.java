package com.homework.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_hw {@Test
	public void Login() throws InterruptedException, AWTException{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	Actions actions =new Actions(driver);
	//driver.findElement(By.id("src"));
	
	WebElement elementLocator = driver.findElement(By.id(("src")));
	actions.sendKeys(Keys.ENTER).perform();
	actions.sendKeys("c").perform();
	Robot robot = new Robot();
    Thread.sleep(1000);
    robot.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(1000);
    robot.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(1000);
    robot.keyPress(KeyEvent.VK_DOWN);
    actions.sendKeys(Keys.ENTER).perform();
    Thread.sleep(2000);
    driver.findElement(By.id("dest"));
    actions.sendKeys(Keys.ENTER).perform();
	actions.sendKeys("c").perform();
	robot.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(1000);
    robot.keyPress(KeyEvent.VK_DOWN);
    robot.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(1000);
    robot.keyPress(KeyEvent.VK_DOWN);
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
    Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[5]/td[2]")).click();
    
    
	
    
    
	
  //  actions.contextClick(elementLocator).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
    /* Actions action = new Actions(driver);
     action.contextClick(elementLocator).build().perform(); /*
     Robot robot = new Robot();
     Thread.sleep(2000);
     robot.keyPress(KeyEvent.VK_DOWN);
     Thread.sleep(2000);
     robot.keyPress(KeyEvent.VK_DOWN);
     Thread.sleep(2000);
     robot.keyPress(KeyEvent.VK_DOWN);
     Thread.sleep(2000);
     robot.keyPress(KeyEvent.VK_ENTER);
	//Actions action = new Actions(driver);
	//action.sendKeys(Keys.TAB).perform();
	//action.sendKeys("c").perform();
	/*action.sendKeys(Keys.ENTER).perform();
	action.sendKeys("c").perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='search']/div/div[1]/div/ul/li[4]")).click();
    driver.findElement(By.id("dest"));
    action.sendKeys(Keys.ENTER).perform();
	action.sendKeys("c").perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='search']/div/div[2]/div/ul/li[3]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
	driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[5]/td[2]")).click();*/
	
	
	
	
	WebElement button = driver.findElement(By.id("search_btn"));
	//System.out.println("click");
	
    button.click();
}
}
