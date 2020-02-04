package practice;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTestng {
	
	@BeforeTest
	public void before() {
		System.out.println("balu2");
	}
	
	@Parameters({"f"})
	@Test()
	public void m1(String s) {
		System.out.println("my car swift");
		System.out.println(s);
	}
	
	@Test(groups= {"smoke"})
	public void m2() {
		System.out.println("my car alto");
		
	}

}
