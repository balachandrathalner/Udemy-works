package Sauce_Labs;

import java.net.MalformedURLException;

import java.net.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest {
	
	 public static final String USERNAME = "balachandratk";
	  public static final String ACCESS_KEY = "216d02b0-a716-42ee-b29e-488ac1ed0daa";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	  
	 
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	
		DesiredCapabilities caps = DesiredCapabilities.edge();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "15.15063");
		
		WebDriver driver=new RemoteWebDriver(new URL(URL), caps);
		
		driver.get("http:www.google.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("balachandra tk");
		
		
		
		
	
	
	}

}
