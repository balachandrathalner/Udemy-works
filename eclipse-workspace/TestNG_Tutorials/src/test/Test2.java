package test;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	@Parameters({"URL","username","password"})
	@Test
	public void MobileloginwebCar(String urlname,String user,String pass) {
	
		System.out.println("balu");
		System.out.println(urlname);
		System.out.println(user);
		System.out.println(pass);

	}

	@Test(groups = {"Smoke"})
public void MobileloginmobCar() {
		System.out.println("talner");
	}
@Test
public void MobileloginAPICar() {
	System.out.println("sagar");
}

@Test
public void loginAPICarsignup() {
	System.out.println("sagar shimoga");
}

	
}
