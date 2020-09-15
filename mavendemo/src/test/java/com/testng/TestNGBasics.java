package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite
	public void setup(){
		System.out.println("setup");
		
	}
	
	@BeforeTest
	public void launchBrowser(){
		System.out.println("launching browser");
	}
	@BeforeClass
	public void enterURL(){
		System.out.println("Enter URL");
	}
	@BeforeMethod
	public void login(){
		System.out.println("login method");
	}
	@Test
	public void test1(){
		System.out.println("Running first test1 method");
	}
	@Test
	public void test2(){
		System.out.println("Running first test2 method");
	}
	@AfterMethod
	public void logout(){
		System.out.println("logout method");
	}
	@AfterClass
	public void closebrowser(){
		System.out.println("closing browser");
		
	}
	@AfterTest
	public void deleteCookies(){
		System.out.println("Deleting cookies");
	}
	@AfterSuite
	public void close(){
		System.out.println("closing browser");
	}

}
