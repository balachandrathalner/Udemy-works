package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
int sum=0;
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22772/nz-vs-eng-2nd-test-england-tour-of-new-zealand-2019");
		
		WebElement tabledriver=driver.findElement(By.cssSelector("[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
			
		int rowcount=tabledriver.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println(rowcount);
		
		int count=tabledriver.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		System.out.println(count);
		
		for(int i=0;i<count-2;i++) {
			String value=tabledriver.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueInt=Integer.parseInt(value);
			sum=sum+valueInt;
			
		}
		
		String extra=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		
		int extravalue=Integer.parseInt(extra);
		int totalactualsum=sum+extravalue;
		System.out.println("Total actual value is :"+totalactualsum);
		
		
		String total=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int totalvalue=Integer.parseInt(total);
		
		System.out.println("Total acpected value is :"+totalvalue);
		
		Assert.assertEquals(totalactualsum, totalvalue);

		if(totalactualsum==totalvalue) {
			System.out.println("test pased");
		}
		else {
			System.out.println("test failed");
		}
		
		
		
		
		
	}
}
