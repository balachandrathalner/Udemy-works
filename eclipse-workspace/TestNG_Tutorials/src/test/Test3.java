package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	@Parameters({"URL","Username"})
	@Test
	
	public void loginwebHome(String urlname,String user) {
		
		System.out.println("loginwebHome");
	System.out.println(urlname);
	System.out.println(user);
		
	}

	@Test(dataProvider = "getdata")
	
	public void loginMobHome(String un,String pw) {
		System.out.println("loginMobHome");
		System.out.println(un);
		System.out.println(pw);
		
		
		
	}
	
	@Test(dependsOnMethods = {"loginwebHome"})
	public void loginAPIHome() {
		System.out.println("loginAPIHome");
	}

	@BeforeSuite
	public void bsiute() {
		System.out.println("i am 1 st");
	}
	
@Test(timeOut = 4000)
public void loginIpadHome() {
		System.out.println("loginIpadHome");
	}
	@DataProvider
	
	public Object[][] getdata() {
		
		Object[][]data=new Object[3][2];
		//1st set
		data[0][0]="baluusername1";
		data[0][1]="balupassword1";
		
		//2nd set
		data[1][0]="baluusername2";
		data[1][1]="balupassword2";
		
		
		
		//3rd set
		data[2][0]="baluusername3";
		data[2][1]="balupassword3";
			return data;
		
		
	}
	
	
	
	
	
	
	
	
	
}
