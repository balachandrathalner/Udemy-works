package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class I_Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/droppable/");

		System.out.println(driver.findElements(By.tagName("iframe")).size());

		// driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		// driver.switchTo().frame(0);
		WebElement f = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(f);

		driver.findElement(By.id("draggable")).click();

		Actions a = new Actions(driver);
		// a.moveToElement(driver.findElement(By.id("draggable"))).clickAndHold().moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Accordion']")).click();
		
		
		
	}

}
