	package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Table1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/23688/pr-vs-dh-24th-match-mzansi-super-league-2019");

		WebElement tabledriver = driver
				.findElement(By.cssSelector("[id='innings_2'] [class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));

		int rocount = tabledriver.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println(rocount);
		int count = tabledriver
				.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		System.out.println(count);
		
		int columncount=tabledriver.findElements(By.cssSelector("[id='innings_2'] [class='cb-col cb-col-100 cb-scrd-itms']")).get(0).findElements(By.tagName("div")).size();
		
		System.out.println("===column count :==== :"+columncount);

		for (int i = 0; i < count - 2; i++) {
			String sumvalue = tabledriver
					.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();

			int summing = Integer.parseInt(sumvalue);

			sum = sum + summing;
			
		}
		String extravalue=tabledriver.findElement(By.xpath(" //div[@id='innings_2']//div[text()='Extras']/following-sibling::div[1]")).getText();
		int extravalueInt=Integer.parseInt(extravalue);
		
		int totalsum=sum+extravalueInt;
		System.out.println(totalsum);
		
		
		String total=tabledriver.findElement(By.xpath("//div[@id='innings_2']//div[text()='Total']/following-sibling::div[1]")).getText();
		int totalvalue=Integer.parseInt(total);
		
		Assert.assertEquals(totalsum, totalvalue);
		
		if(totalsum==totalvalue) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
			}

}
