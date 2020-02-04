package Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.HomePage_POFactory;
import objectRepository.LoginPage_POFactory;


public class LoginApplication_POFactory {

	private Logger log=LogManager.getLogger(LoginApplication_POFactory.class.getName());
	
	WebDriver driver;

	@Test

	public void Login() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Talaneru\\eclipse-workspace\\PageObjectModel\\datadriven.properties");
		
		log.info("connect to extrenal properties file");
		prop.load(fis);

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");
		driver = new ChromeDriver();

		log.debug("will maximise the window");
		
		driver.manage().window().maximize();
		
		log.info("window maximised");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

		LoginPage_POFactory lp = new LoginPage_POFactory(driver);

		log.debug("sending username");
		
		lp.EmailId().sendKeys(prop.getProperty("username"));

		log.info("usename entered");
		
		log.debug("sending password");
		lp.Password().sendKeys(prop.getProperty("password"));
		log.info("usename password");
		// lp.Submit().click();
		log.debug("will clicking the home link");
		lp.Home().click();

		log.info("home clicked");
		
		HomePage_POFactory hp = new HomePage_POFactory(driver);
		hp.SearchBox().click();
		
		log.debug("sending the text 'facebook'");
		
		hp.SearchBox().sendKeys(prop.getProperty("search"));
		
		log.info("'Facebook sent to the search box");
		
		log.debug("will clicking the search ");
		hp.Submit().click();
		
		log.info("clicked on search");

	}
}
