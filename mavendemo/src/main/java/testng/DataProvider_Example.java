package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Example {

	
		// TODO Auto-generated method stub
		//dataprovider --if u want run testcases no of times with
		//different types of data
		//method return type is 2D object
	     @DataProvider
		public Object[][] testData(){
			Object[][] data = new Object[2][2];
			data[0][0] = "Test1";
			data[0][1] = "Test2";
			data[1][0] = "Test3";
			data[1][1] = "Test4";
			return data;
		}
		@Test(dataProvider = "testData")
		public void test(String s1,String s2){
			System.out.println("S1" + s1 + "S2" + s2);

	}

	
		
	

}
