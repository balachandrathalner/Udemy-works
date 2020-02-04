package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("http://qaclickacademy.com/practice.php");
		
		
		WebElement check1=driver.findElement(By.id("checkBoxOption1"));

		
		System.out.println(check1.isSelected());
		Assert.assertFalse(check1.isSelected());
		check1.click();
		System.out.println(check1.isSelected());
		Assert.assertTrue(check1.isSelected());
		
		check1.click();
		System.out.println(check1.isSelected());
		Assert.assertFalse(check1.isSelected());
			

		//count of checkbox
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 3);
		
		
		
	}

}
