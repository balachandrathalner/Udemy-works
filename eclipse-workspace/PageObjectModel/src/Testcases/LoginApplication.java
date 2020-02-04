package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class LoginApplication {

	WebDriver driver;
	
	@Parameters({"url"})
	@Test
	
	public void Login(String urlname) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(urlname);
		
		LoginPage lp=new LoginPage(driver);
		
		lp.EmailId().sendKeys("balu@gmail.com");
		
		lp.Password().sendKeys("xxxxxx");
		
		//lp.Submit().click();
		lp.Home().click();
	
		
		HomePage hp=new HomePage(driver);
		hp.SearchBox().click();
		hp.SearchBox().sendKeys("djsagdjag");
		hp.Submit().click();
		
			
	
	}
}
