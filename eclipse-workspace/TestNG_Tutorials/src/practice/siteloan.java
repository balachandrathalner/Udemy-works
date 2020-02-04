package practice;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class siteloan extends Simple{
	
	
	
	@Test
	public void s1() throws IOException {
		login();
		System.out.println("site 1");
	}
	@Test
	public void s2() {
		System.out.println("site 2");
	}
}
