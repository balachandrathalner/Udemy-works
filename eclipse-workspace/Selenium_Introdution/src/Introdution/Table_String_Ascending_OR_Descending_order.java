package Introdution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Table_String_Ascending_OR_Descending_order {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector("[id=\"sortableTable\"] tr:nth-child(1) th:nth-child(2)")).click();
	//	driver.findElement(By.cssSelector("[id=\"sortableTable\"] tr:nth-child(1) th:nth-child(2)")).click();
		
		List<WebElement> colm = driver.findElements(By.xpath("//tr/td[2]"));

		ArrayList<String> original = new ArrayList<String>();

		for (int i = 0; i < colm.size(); i++) {

			original.add(colm.get(i).getText());

		}

		ArrayList<String> copy = new ArrayList<String>();

		for (int i = 0; i < colm.size(); i++) {

			copy.add(colm.get(i).getText());

		}

		Collections.sort(copy);
		Collections.reverse(copy);

		System.out.println("===========original==================");

		for (String o : original) {
			System.out.println(o);
		}
		System.out.println("===============copy==============");

		for (String c : copy) {
			System.out.println(c);
		}

		Assert.assertTrue(original.equals(copy));
		System.out.println("test case passed");

	}

}
