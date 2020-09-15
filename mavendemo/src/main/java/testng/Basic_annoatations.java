package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic_annoatations {
	
	
    @BeforeSuite
	public void test1() {

	}
    @BeforeTest
	public void test2() {

	}
    @BeforeClass

	public void test3() {

	}
    @BeforeMethod

	public void test4() {

	}
    
    @Test
	public void test5() {

	}
    @AfterMethod

   	public void test6() {

   	}
    @AfterClass

   	public void test7() {

   	}
    @AfterTest
	public void test8() {
}
    @BeforeSuite
    public void test9(){
    	
    }
    

}

/*@BeforeSuite
@BeforeTest
@BeforeClass
@BeforeMethod
@Test1
@Aftermethod
@BeforeMethod
 @Test2
@Aftermethod
@Afterclass
@Aftertest */



