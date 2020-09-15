package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Test {
	
	@Test
	@Parameters({"data"})
	public void test1(@Optional("default")String data){
		System.out.println(data);

}
}
