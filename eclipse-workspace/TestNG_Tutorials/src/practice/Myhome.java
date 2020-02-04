package practice;

import org.testng.annotations.Test;

public class Myhome {
	
	@Test
	public void n1() {
		System.out.println("home 1");
	}

	@Test(groups= {"smoke"})
	public void n2() {
		System.out.println("home 2");
	}
	
}
