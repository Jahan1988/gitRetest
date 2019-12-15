package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties properties;
	//propertiesPath will return user directory of user
	//C:\Users\User Win 7\eclipse-workspace\com.bdd.tekschool\src\test\resources\Properties\ProjectProperty.properties
	private String propertiesPath = System.getProperty("user.dir");
	private String ProjectPropertyPath = propertiesPath + "\\src\\test\\resources\\Properties\\ProjectProperty.properties";
	
	//0. Create a constructor
	public Base () {
		
		try {
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(ProjectPropertyPath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}
	
	public static String browserName() {
		String browser = properties.getProperty("browserName");
		return browser;
	}
	public static String getURL() {
		String url = properties.getProperty("url");
		return url;//https://www.tekschoolofamerica.com/
	}

	public static long getPageLoadTimeOut() {
		String pageLoadTimeOut = properties.getProperty("pageLoadTimeOut");
		return Long.parseLong(pageLoadTimeOut);//converting String to long
	}
	public static long getImplicitWait () {
		String implicitWait = properties.getProperty("implicitWait");
		System.out.println(implicitWait);
		return Long.parseLong(implicitWait);
		
			}
	
	public static void initializeDriver () {
		driver.get(getURL());
	}
}
