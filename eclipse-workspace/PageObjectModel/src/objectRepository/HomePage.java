package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;

	By searchbox=By.id("srchword");
	By clicksearch=By.xpath("(//input[@type='submit'])[1]");
	By creat=By.linkText("Create Account");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement SearchBox() {
		return driver.findElement(searchbox);
		
	}
	public WebElement Submit() {
		return driver.findElement(clicksearch);
	}
	
	public WebElement CreateAc() {
		
		return driver.findElement(creat);
		
	}
	
}
