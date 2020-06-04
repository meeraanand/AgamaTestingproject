package com.homework.testcases;

import java.io.IOException;

import org.openqa.selenium.By;

public class WrapperClassLogin {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WrapperMethodLogin wm = new WrapperMethodLogin();
		wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		wm.enterbyid("txtUsername", "Admin");

		wm.enterbyid("txtPassword", "admin123");
		wm.clickbyxpath("//*[@id='btnLogin']");
		
		wm.clickbylinktext("PIM");
		Thread.sleep(1000);
		wm.clickbyxpath("//*[@id='btnAdd']");
		wm.enterbyid("firstName", "meera");
		wm.enterbyid("middleName", "anand");
		wm.enterbyid("lastName", "karjala");
		wm.enterbyid("employeeId", "0073");
		wm.enterbyid("photofile", "C:/Users/meera/Pictures/session.png");
	    wm.checkbox("chkLogin");
	    wm.enterbyid("user_name", "meera123");
	    wm.enterbyid("user_password", "123meera");
	    wm.enterbyid("re_password", "123meera");
	    wm.selectdropdown("Enabled");
	    wm.clickbyxpath("//*[@id='btnSave']");
	    wm.takesnap("C:/Users/meera/pictures/session2.png"); 
	  
			
	}

}
