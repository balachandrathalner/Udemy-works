package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("klfj");
		driver.findElement(By.cssSelector("[class*='password']")).sendKeys("lfzsjf");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("[id='error']")).getText());
		
	}

}
