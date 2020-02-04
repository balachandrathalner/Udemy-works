package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.makemytrip.com/");

		WebElement cli = driver.findElement(By.id("fromCity"));
		cli.click();

		WebElement source = driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__')]"));
		source.sendKeys("MUM");
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);

		WebElement destination = driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__')]"));

		destination.sendKeys("DEL");
		// Thread.sleep(2000);

		for (int i = 1; i < 8; i++) {

			destination.sendKeys(Keys.ARROW_DOWN);
		}
		destination.sendKeys(Keys.ENTER);

	}

}
