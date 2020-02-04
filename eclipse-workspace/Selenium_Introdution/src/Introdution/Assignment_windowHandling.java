package Introdution;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_windowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("http://the-internet.herokuapp.com/windows");

		driver.findElement(By.linkText("Multiple Windows")).click();

		System.out.println("parent title :" + driver.getTitle());

		driver.findElement(By.linkText("Click Here")).click();

		Set<String> id = driver.getWindowHandles();

		Iterator<String> it = id.iterator();

		String parentid = it.next();
		String childid = it.next();

		driver.switchTo().window(childid);

		System.out.println("chiled title :" + driver.getTitle());

		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

		driver.switchTo().defaultContent();

		System.out.println("parent title :" + driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

	}

}
