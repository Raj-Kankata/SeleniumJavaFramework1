package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {

	static WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/vijayamacbook/eclipse-workspace/SeleniumJAVAFramework/drivers/chromedriver/chromedriver");

		driver = new ChromeDriver();
	}

	@Test
	public static void googleSearch2 () {


		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		//		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.RETURN);
	}
	
	@Test
	public static void googleSearch3 () {


		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		//		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed successfully");

	}
}
