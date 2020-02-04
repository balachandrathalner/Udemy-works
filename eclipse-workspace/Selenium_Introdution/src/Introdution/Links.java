package Introdution;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://www.qaclickacademy.com/practice.php");

		// No. of link count
		System.out.println(driver.findElements(By.tagName("a")).size());
//No.ofFooter links
		WebElement footdriver = driver.findElement(By.cssSelector("div#gf-BIG"));
		System.out.println(footdriver.findElements(By.tagName("a")).size());

		// No. ofDiscount coupons links

		WebElement discountdriver = footdriver.findElement(By.xpath("//*[@class='gf-t']//td[1]/ul"));
		System.out.println(discountdriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < discountdriver.findElements(By.tagName("a")).size(); i++) {

			String tab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			discountdriver.findElements(By.tagName("a")).get(i).sendKeys(tab);

			Thread.sleep(5000);

		}

		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		String parentid = it.next();

		while (it.hasNext()) {

			String s = it.next();
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());

		}

		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());

	}

}
