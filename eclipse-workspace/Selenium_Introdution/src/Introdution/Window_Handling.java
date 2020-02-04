package Introdution;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Window_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://support.google.com/accounts/answer/27441?hl=en");
		driver.findElement(By.cssSelector("[class='appbar-icon appbar-link-container']")).click();
		System.out.println(driver.getTitle());
		
		Set<String>id=driver.getWindowHandles();
		Iterator<String>it=id.iterator();
		
		String parentid=it.next();
		String childid=it.next();
		
		System.out.println("=====switch to child windwo=====");
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		System.out.println("====switch to parent windwo====");
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());

		
		driver.quit();
		
		
		
		
		
		
		
		
		
	
	}

}
