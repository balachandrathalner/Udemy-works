package Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resource.LoginPage;

public class LoginFB {

	@Test(dataProvider = "getdata")
	public void Login_FB(String un, String pw) {
		// TODO Auto-generated constructor stub

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		LoginPage lp = new LoginPage(driver);
		
		lp.EmailId().sendKeys(un);
		lp.Password().sendKeys(pw);
		lp.Login().click();
		

		if(driver.findElement(By.linkText("Home")).isDisplayed()) {
			System.out.println("Login successfull for username ="+un+" And Password ="+pw );
		}
		else {
			System.out.println("login failed");
		}
	
		
		
	}

	@DataProvider

	public Object[][] getdata() throws EncryptedDocumentException, IOException {

		File f = new File("C:\\Users\\Talaneru\\Documents\\FBdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workBook = (XSSFWorkbook) WorkbookFactory.create(fis);
		XSSFSheet sheet = workBook.getSheet("demo");
		Object[][] data = new Object[6][2];
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 2; j++) {
				data[i][j] = sheet.getRow(i).getCell(j).toString();

			}
		}
		return data;
	}

}
