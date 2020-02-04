package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.spicejet.com/");

		
		  driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		  
		  
		  while (!driver.findElement(By
		  .cssSelector("[class='ui-datepicker-group ui-datepicker-group-first'] [class='ui-datepicker-month']"
		  )).getText().contains("August")) { driver.findElement(By.
		  cssSelector("[class='ui-icon ui-icon-circle-triangle-e']")).click(); }
		 
		// date

		int count =driver.findElements(By.cssSelector("[class='ui-state-default']")).size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text =driver.findElements(By.cssSelector("[class='ui-state-default']")).get(i).getText();

			if (text.equalsIgnoreCase("23")) {
			
				driver.findElements(By.cssSelector("[class='ui-state-default']")).get(i).click();
				break;
			}
		}

	}

}
