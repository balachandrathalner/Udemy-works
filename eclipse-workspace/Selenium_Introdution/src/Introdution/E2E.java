package Introdution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		driver.get("https://www.spicejet.com/");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		// click radio button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		// from city
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BOM']")).click();

		// To city
		driver.findElement(
				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='VNS']")).click();
		// Calendar

		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("is desable");
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);
		}

		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date1")).getText());

		// passenger

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();

		Select sel = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));

		sel.selectByValue("6");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");

		// currency
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
		Select select = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		select.selectByIndex(3);
		
		System.out.println(select.getFirstSelectedOption().getText());
		
		Assert.assertEquals(select.getFirstSelectedOption().getText(), "USD");
		
		

		// Check box
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());

		// search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	
	}

}
