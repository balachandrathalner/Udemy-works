package objectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage_POFactory {

	WebDriver driver;

	@FindBy(id="srchword")
	WebElement searchbox;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	WebElement clicksearch;
	
	@FindBy(linkText = "Create Account")
	WebElement create;
		
	public HomePage_POFactory(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement SearchBox() {
		return searchbox;
		
	}
	public WebElement Submit() {
		return clicksearch;
	}
	
	public WebElement CreateAc() {
		
		return create;
		
	}
	
}
