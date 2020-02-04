package Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_Fb {
	
	@Test
	
	public void login() {
		

		System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		
		
		
		
	
		
		
		
	}
	
	  @DataProvider
	    public Object[][] readData() throws Exception
	    {
	        File f = new File("C:/Users/Vikrant/Documents/MavenTesting.xlsx");
	        FileInputStream fis = new FileInputStream(f);
	        XSSFWorkbook workBook = (XSSFWorkbook) WorkbookFactory.create(fis);
	        XSSFSheet sheet=workBook.getSheet("Sheet1");
	        Object array[][]=new Object[2][2];
	        for(int i =0;i<2;i++)
	        {
	            for( int j=0;j<2;j++)
	            {
	                array[i][j]=sheet.getRow(i).getCell(j).toString();

	            }
	        }
	        return array;

	
	

}
}