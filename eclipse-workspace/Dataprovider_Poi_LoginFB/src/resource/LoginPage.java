package resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	
	@FindBy(id="email")
	private WebElement emailid;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement login;
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	public WebElement EmailId() {
		return emailid;
	}
	
	public WebElement Password() {
		return password;
	}
	
	public WebElement Login() {
		return login;
	}
	
	
	
	
	
	
	
}
