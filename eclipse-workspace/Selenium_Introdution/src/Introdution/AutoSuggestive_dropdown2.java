package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestive_dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.cleartrip.com/");
		
		
		WebElement source=driver.findElement(By.id("FromTag"));
		
		Thread.sleep(5000);
		source.sendKeys("BAN");
		
		Thread.sleep(5000);
		
		source.sendKeys(Keys.ENTER);
		
		
		WebElement destination=driver.findElement(By.id("ToTag"));
		
		destination.sendKeys("CHA");
		Thread.sleep(5000);
		
		for(int i=1;i<7;i++) {
		destination.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(3000);
		}
		destination.sendKeys(Keys.ENTER);
		
		
		
		
		
		

	
	}

}
