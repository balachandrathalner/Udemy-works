package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddif_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'in')]")).sendKeys("asghfkahdu");
		driver.findElement(By.xpath("//input[contains(@type,'pa')]")).sendKeys("6876487");
		driver.findElement(By.cssSelector("input[title*='in']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Wrong username and password combination.']")));
		  
		
		
		
		
		
		
		
	}

}
