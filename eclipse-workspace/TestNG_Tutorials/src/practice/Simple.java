package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Simple {

	public void login() throws IOException {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Talaneru\\eclipse-workspace\\TestNG_Tutorials\\src\\practice\\data.properties");

		prop.load(fis);

		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("url"));
		
	}

}
