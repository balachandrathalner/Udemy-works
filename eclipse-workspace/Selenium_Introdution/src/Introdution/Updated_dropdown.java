package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Updated_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.goibibo.com/flights/");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.goibibo.com/flights/");
		String tit=driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(tit, "Flight Tickets, Flights Booking at Lowest Airfare, Book Air Tickets-Goibibo");
		System.out.println(driver.findElement(By.id("pax_link_common")).getText());
		driver.findElement(By.id("pax_link_common")).click();
		
		for(int i=1;i<7;i++) {
		driver.findElement(By.id("adultPaxPlus")).click();
		
		}
		driver.findElement(By.id("pax_close")).click();
		
		System.out.println(driver.findElement(By.id("pax_link_common")).getText());
	}

}
