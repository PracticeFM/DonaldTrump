package Util_BC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase_BootCamp {

	public static Properties proper;
	public static WebDriver driver;
	
	public TestBase_BootCamp() {
		
		try {
			FileInputStream DDD = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Config_BC\\unity.properties");	
			proper = new Properties();
			proper.load(DDD);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void i() {
		
		String BrowsName = proper.getProperty("browser01");
		if(BrowsName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);		
		}
		else if (BrowsName.equals("FF"));
		System.out.println("Browser not found");
		}
	
	public static void LaunchDell(String URL) {
		
		driver.get(proper.getProperty("URL01"));	
	}
}
