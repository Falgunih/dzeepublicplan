package com.dzeepublicplan.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static Properties prop;
	public static FileInputStream fis;
	public static WebDriver driver;

	public TestBase() {

		try {
			prop = new Properties();
			fis = new FileInputStream(
					"C:/Dzeepublicplan/com.dzeepublicplan/src/main/java/com/dzeepublicplan/config/config.properties");

			prop.load(fis);

		} catch (Exception e) {
			System.out.println("file is not found " + e.getMessage());
		}
	}

	public void init() {
		
		String browser = prop.getProperty("Browser");
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Dzeepublicplan/com.dzeepublicplan/Browsers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("Webdriver.ie.driver", "C:/Dzeepublicplan/com.dzeepublicplan/Browsers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

	}

}
