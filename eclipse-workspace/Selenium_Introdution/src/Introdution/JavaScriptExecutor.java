package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement from = driver.findElement(By.id("fromPlaceName"));

		js.executeScript("window.scrollBy(0,300)");

		from.sendKeys("BANG");

		/*
		int i = 0;
		while (i < 5) {
			Thread.sleep(5000);
			from.sendKeys(Keys.ARROW_DOWN);

			i++;
		}

		String s = js.executeScript("return document.getElementById('fromPlaceName').value").toString();

		System.out.println(s);

		if(s.contains("AIRPORT")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

		*/

		int i = 0;
		
		from.sendKeys(Keys.ARROW_DOWN);
		String text = js.executeScript("return document.getElementById('fromPlaceName').value").toString();
		
		while (!text.equalsIgnoreCase("BANGALORE INTERNATION AIRPORT")) {
		
			Thread.sleep(5000);
		 text = js.executeScript("return document.getElementById('fromPlaceName').value").toString();
			
			System.out.println(text);
			
			from.sendKeys(Keys.ARROW_DOWN);

				
			i++;
			
			if(i>7) {
				break;
			}
		}

		if(i>7) {
			System.out.println("element not present");
		}
	
		else {
			System.out.println("element is present");
		}
	
	
	
	
	
	}

}
