package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));

		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.switchTo().defaultContent();
		
		
		
	
	}

}
