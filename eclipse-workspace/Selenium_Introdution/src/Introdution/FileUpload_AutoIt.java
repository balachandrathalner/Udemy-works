package Introdution;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload_AutoIt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://altoconvertpdftopng.com/");
		

		driver.findElement(By.id("dropzoneInput-label")).click();
				

		Runtime.getRuntime().exec("C:\\Users\\Talaneru\\Documents\\Fileupload\\Fileupload.exe");
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='-btn--medium']")));
		
		driver.findElement(By.cssSelector("[class*='-btn--medium']")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("")));
		
		driver.findElement(By.linkText("Download Now")).click();
		
		
		
		
		
	}

}
