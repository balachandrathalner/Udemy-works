package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actions_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

		Actions a = new Actions(driver);
		//moves to specific element
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		//Send capital letter
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("shgkhf").doubleClick().build().perform();
		
		
		//Right click(context click)
		
		//a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-orders']"))).contextClick().build().perform();
		WebElement click=driver.findElement(By.xpath("//a[@id='nav-orders']"));
		a.moveToElement(click).contextClick().build().perform();
		
		
		
		
		
		
		
		
		
		
	}

}
