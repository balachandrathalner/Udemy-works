package Introdution;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("http://www.qaclickacademy.com/practice.php");

		WebElement tabledriver = driver.findElement(By.id("product"));
		/*
		 * int rowCount =
		 * tabledriver.findElements(By.xpath("//table[@id='product']//tr")).size();
		 * System.out.println(rowCount);
		 * 
		 * int coulumnCount =
		 * tabledriver.findElements(By.xpath("//table[@id='product']//tr[1]/th")).size()
		 * ; System.out.println(coulumnCount);
		 * 
		 * int count =
		 * tabledriver.findElements(By.xpath("//table[@id='product']//tr[3]/td")).size()
		 * ;
		 * 
		 * for (int i = 0; i < count; i++) {
		 * System.out.println(tabledriver.findElements(By.xpath(
		 * "//table[@id='product']//tr[3]/td")).get(i).getText());
		 * 
		 * }
		 */
		
		
		int rowcount=tabledriver.findElements(By.tagName("tr")).size();
		System.out.println(rowcount);
		
		int coulmncount=tabledriver.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
		System.out.println(coulmncount);
		
		List<WebElement> text=tabledriver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		
		
		System.out.println(text.get(0).getText());
		System.out.println(text.get(1).getText());
		System.out.println(text.get(2).getText());
		
		
	}

}
