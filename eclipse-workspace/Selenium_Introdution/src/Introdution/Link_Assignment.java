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
import org.openqa.selenium.support.ui.Select;

public class Link_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.guru99.com/selenium-tutorial.html");
		
		
		WebElement footerdriver=driver.findElement(By.xpath("//*[@id=\"g-footer\"]/div/div[1]/div/div/div[1]/div/div/div[3]/div[1]/div/div"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		for(int i=0;i<footerdriver.findElements(By.tagName("a")).size();i++) {
			
			String tab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerdriver.findElements(By.tagName("a")).get(i).sendKeys(tab);
			
			Thread.sleep(5000);
		}
		
		Set<String>id=driver.getWindowHandles();
		
		Iterator<String>it=id.iterator();
		
		//String parentid=it.next();
		
		while(it.hasNext()) {
			
			String s=it.next();
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
		
		}
		//driver.switchTo().window(parentid);
		
		
		
		
		
	
	}

}
