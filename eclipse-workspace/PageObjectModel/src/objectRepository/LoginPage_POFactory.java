package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POFactory {

	WebDriver driver;

	@FindBy(id = "login1")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement go;

	@FindBy(linkText = "Home")
	WebElement home;

	public LoginPage_POFactory(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebElement EmailId() {

		return username;
	}

	public WebElement Password() {
		return password;
	}

	public WebElement Submit() {
		return go;
	}

	public WebElement Home() {
		return home;

	}

}
