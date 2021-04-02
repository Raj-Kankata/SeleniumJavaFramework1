package test;

import org.testng.annotations.Test;

import config.PropertiesFile;
import freemarker.log.Logger;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {

	static WebDriver driver = null;
	public static String browserName = null;
	
	
	@BeforeTest
	public void setUpTest() throws IOException {
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/vijayamacbook/eclipse-workspace/SeleniumJAVAFramework/drivers/chromedriver/chromedriver");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", projectPath+"//drivers/geckodriver/geckodriver");
			driver = new FirefoxDriver();
		}
		
	
	}

	@Test
	public static void googleSearch () throws InterruptedException {


		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void tearDownTest() throws IOException {
		driver.close();
//		driver.quit();
		System.out.println("Test Completed successfully");
		PropertiesFile.setProperties();
	}
}
