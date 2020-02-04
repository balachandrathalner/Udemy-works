package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;
import resources.LoginPage;

public class Login {

	
	@Test(dataProvider = "getdata")
	
	public void login(String un,String pw) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		LoginPage lp=new LoginPage(driver);
		
		lp.EmailId().sendKeys(un);
		lp.Password().sendKeys(pw);
		lp.Login().click();
		
		if(driver.findElement(By.linkText("Home")).isDisplayed()) {
			System.out.println("Login successfull for username ="+un+"Password ="+pw );
		}
		else {
			System.out.println("login failed");
		}
	
		
	}
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][]data=new Object[4][2];
		
		data[0][0]="username1";
		data[0][1]="password1";
		

		data[1][0]="username2";
		data[1][1]="password2";
		

		data[2][0]="balutk87@gmail.com";
		data[2][1]="nnarayanasharmahh";
		

		data[3][0]="username4";
		data[3][1]="password4";
	
		return data;
	}
	
	
}
