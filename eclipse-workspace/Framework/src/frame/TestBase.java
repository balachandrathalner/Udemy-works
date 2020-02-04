package frame;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {

	public WebDriver driver;
	
	@BeforeSuite

	public void m1() {
		System.out.println("i am execute first");
		
		
	
	}

	@Test
	public void login() throws IOException {

		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Talaneru\\eclipse-workspace\\Framework\\src\\frame\\datadriven.properties");
		
		prop.load(fis);

		//System.out.println(prop.getProperty("username"));
		//System.out.println(prop.getProperty("password"));
		//System.out.println(prop.getProperty("url"));
		
		if(prop.getProperty("browser").contains("chrome")){
			

			System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");
				driver=new ChromeDriver();
		
		}
		else if(prop.getProperty("browser").contains("firefox")){
			
				driver=new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
	}

	@AfterSuite

	public void m2() {
		System.out.println("i ma exicute last");
	}

}
