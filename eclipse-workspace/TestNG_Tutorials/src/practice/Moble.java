package practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Moble {

	@BeforeSuite
	public void before() {
		System.out.println("balu1");
	}

	@BeforeMethod
	public void beforem() {
		System.out.println("bm");
	}

	
	  @Parameters({"browser","balu"})
	  
	  @Test(groups= {"smoke"},dependsOnMethods= {"mob2"}) 
	  public void mob1(String
	  b,String a) { System.out.println("yuporia"); System.out.println(b);
	  System.out.println(a); }
	 
	@Test(dataProvide = "getdata")
	public void mob2(String un, String pw) {
		// System.out.println("apple");
		System.out.println(un);
		System.out.println(pw);
	}
	

	@DataProvider
	public Object[][] getdata() {

		Object[][] data = new Object[2][2];

		data[0][0] = "ahf";
		data[0][1] = "gfjg";

		data[1][0] = "hf";
		data[1][1] = "fjkh";
		return data;

	}

}
