package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector("[class='fsw_inputBox dates inactiveWidget ']")).click();

		WebElement month = driver.findElement(By.cssSelector("[class='DayPicker-Caption']"));
		
		
		while (!month.getText().contains("September")) {

			driver.findElement(By.cssSelector("[class='DayPicker-NavButton DayPicker-NavButton--next']")).click();

		}

		int count = driver.findElements(By.cssSelector("[class='DayPicker-Day']")).size();

		for (int i = 0; i < count; i++) {

			String text = driver.findElements(By.cssSelector("[class='DayPicker-Day']")).get(i).getText();

			if (text.equalsIgnoreCase("27")) {

				driver.findElements(By.cssSelector("[class='DayPicker-Day']")).get(i).click();

				break;

			}

		}

	}

}
