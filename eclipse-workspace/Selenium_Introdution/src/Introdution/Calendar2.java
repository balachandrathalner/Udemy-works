package Introdution;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.id("travel_date")).click();

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='datepicker-switch']")).getText()
				.contains("November")) {

			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();

		}

		int count = driver.findElements(By.cssSelector(".day")).size();

		for (int i = 0; i < count; i++) {

			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}

		}

	}

}
