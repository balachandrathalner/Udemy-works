package test;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	@Parameters({"URL"})
	@Test
	public void m1(String urlname) {
		System.out.println("asd");
		System.out.println(urlname);
	}

	@Test
	public void m2() {
		
		System.out.println("ggjg");
		Assert.assertTrue(false);
		
	}
	
	
	@Test(dataProvider ="getdata")
	public void m3(String un,String pw) {
		System.out.println("jdsgag");
		System.out.println(un);
		System.out.println(pw);
		
	}
@AfterTest
	
	public void after() {
		System.out.println("NNNN");
	}

	@DataProvider
	public Object[][] getdata(){
		
		Object[][]data=new Object[3][2];
		
		//1st set
		data[0][0]="username1";
		data[0][1]="password1";
		
		//2nd set
		data[1][0]="username2";
		data[1][1]="password2";
		
		//3rd set
		data[2][0]="username3";
		data[2][1]="password3";
		
			return data;
	}		


}
