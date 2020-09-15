package testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test
	public void test1(){
		Assert.assertTrue(true);
		
	}
	@Test(dependsOnMethods={"test1"})
	public void test2() {
		System.out.println("Test2 pass");
		
	}
	@Test(dependsOnMethods = {"test1","test2"})
	public void test3() {
		System.out.println("Test3 pass");
		
	}
	@Test
	public void test4() {
		Assert.assertFalse(false);
		
	}
	
	
	

}
