package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_CleartripCom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		driver.get("https://www.cleartrip.com");

		// Radio button
		if (driver.findElement(By.id("OneWay")).isSelected()) {

			Assert.assertTrue(true);
		} else {
			driver.findElement(By.id("OneWay")).click();

		}

		System.out.println(driver.findElement(By.id("OneWay")).isSelected());

		// From
		WebElement from = driver.findElement(By.id("FromTag"));
		from.click();
		Thread.sleep(3000);
		from.sendKeys("CHE");
		Thread.sleep(5000);
		from.sendKeys(Keys.ENTER);

		// TO

		WebElement to = driver.findElement(By.id("ToTag"));
		
		Thread.sleep(3000);
		to.sendKeys("BAN");
		Thread.sleep(3000);

		for (int i = 1; i < 7; i++) {
			to.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);

		}

		Thread.sleep(3000);
		to.sendKeys(Keys.ENTER);

		// Calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();

		// dropdowns

		Select Asel = new Select(driver.findElement(By.id("Adults")));
		Asel.selectByValue("6");

		System.out.println(Asel.getFirstSelectedOption().getText());

		Select Csel = new Select(driver.findElement(By.id("Childrens")));
		Csel.selectByVisibleText("3");

		System.out.println(Csel.getFirstSelectedOption().getText());

		Select Isel = new Select(driver.findElement(By.id("Infants")));
		Isel.selectByIndex(4);

		System.out.println(Isel.getFirstSelectedOption().getText());

		// more option
		// class
		driver.findElement(By.id("MoreOptionsLink")).click();

		Select Cclass = new Select(driver.findElement(By.id("Class")));
		Cclass.selectByIndex(2);

		// airlines
		WebElement air = driver.findElement(By.id("AirlineAutocomplete"));
		air.sendKeys("IND");
		Thread.sleep(3000);

		for (int i = 1; i < 7; i++) {
			air.sendKeys(Keys.ARROW_DOWN);

		}
		air.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println(air.getText());

		// search
		driver.findElement(By.id("SearchBtn")).click();
		
	}
	}


