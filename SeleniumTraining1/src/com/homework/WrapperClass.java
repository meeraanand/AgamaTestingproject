package com.homework;

import java.io.IOException;

import org.openqa.selenium.By;

public class WrapperClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WrapperMethods wm = new WrapperMethods();
		wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		wm.enterbyid("txtUsername", "Admin");
		
		wm.enterbyid("txtPassword", "admin123");
		wm.clickbyxpath("//*[@id='btnLogin']");
		//wm.clickbylinktext("Admin");
		wm.clickbyxpath("//*[@id='menu_admin_viewAdminModule']");
		wm.enterbyid("searchSystemUser_userName", "meera123");
		wm.selectdropdown("Admin");
		wm.enterbyid("searchSystemUser_employeeName_empName", "meera");
		wm.selectdropdown1("Enabled");
		wm.clickbyxpath("//*[@id='searchBtn']");
		wm.clickbyxpath("//*[@id='resetBtn']");
		wm.takesnap("C:/Users/meera/pictures/session.png");
		
		//wm.enterbyname("searchSystemUser[userName]]", "meeraanand");
		//driver.findElement(By.linkText("Admin")).click();
		//driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		//wm.takesnap("C:/Users/meera");
		//wm.closeapp();

	}

}
