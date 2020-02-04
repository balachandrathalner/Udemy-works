package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
			
		driver.findElement(By.id("divpaxinfo")).click();
		
		Select sel=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		sel.selectByValue("3");
		sel.selectByIndex(5);
		sel.selectByVisibleText("8");
		

	}

}
