package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {

	@BeforeClass

	public void bfclass() {
		System.out.println("UUUU");
	}

	@AfterSuite
	public void asuite() {
		System.out.println("i am last");
	}

	@Test(groups = {"Smoke"})
	public void mn() {
		System.out.println("Test4");
	}

	@BeforeTest
	public void before() {
		System.out.println("MMMM");
	}

	@BeforeMethod

	public void bm() {
		System.out.println("before method");
	}

	@AfterClass
	public void afclass() {
		System.out.println("iam after calss");
	}

	@AfterMethod

	public void bm2() {
		System.out.println("After method");
	}

}