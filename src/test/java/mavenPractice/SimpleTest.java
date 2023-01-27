package mavenPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleTest {

	@Test(groups="smokeTest")
	public void printLine() {
		System.out.println("Made some changes");
		
	}
	@Test
	public void mavnprctc()
		
	{
		System.out.println("this is updation");
	}
	
	@Test(dataProvider = "data")
	public void smt(String src, String dest) {
		System.out.println(src+"--->"+dest);
	}
	
	@DataProvider
	public Object[][] data(){
		Object[][] obj = new Object[2][2];
		obj[0][0] = "Bangalore";
		obj[0][1] = "Mangalore";
		obj[1][0] = "Tumkur";
		obj[1][1] = "Tiptur";
		return obj;
	}
	
}
