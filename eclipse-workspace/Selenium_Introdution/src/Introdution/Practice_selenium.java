package Introdution;

import java.awt.RenderingHints.Key;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.id("travel_date")).click();
//month
		WebElement month = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"));

		while (!month.getText().contains("June")) {

			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
//date
		int count = driver.findElements(By.cssSelector(".day")).size();

		for (int i = 0; i < count; i++) {

			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if (text.equalsIgnoreCase("15")) {
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}

		}
	}

}
