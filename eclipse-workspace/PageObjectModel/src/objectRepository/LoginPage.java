package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	
	
	By username=By.id("login1");
	By password=By.xpath("//input[@id='password']");
	By go=By.xpath("//input[@type='submit']");
	By home=By.linkText("Home");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement EmailId() {
		
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement Submit() {
		return driver.findElement(go);
	}
	
	public WebElement Home() {
		return driver.findElement(home);
		
	}
	
	
	
	
	
	
	
}
