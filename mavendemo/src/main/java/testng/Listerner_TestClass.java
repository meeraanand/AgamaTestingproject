package testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Listerner_TestClass {
	
	@Test
	public void test1(){
		
	}
	@Test
	public void test2(){
		throw new SkipException("I am skipping test");
		
	}
	@Test
	public void test3(){
		
	}

}
