package com.testcases;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/meera/Downloads/chromedriver_latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/a/div")).click();
		driver.findElement(By.partialLinkText("64 bit Windows IE")).click();
	
		Thread.sleep(3000);
        
		File file = new File("C:/Users/meera/Downloads/IEDriverServer_x64_3.150.1 (1).zip");
		boolean check = file.exists();
		System.out.println(check);
		
	
	
	}

}
