package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagesPOM.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
		
	}
	
	public static void googleSearch () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vijayamacbook/eclipse-workspace/SeleniumJAVAFramework/drivers/chromedriver/chromedriver");
		
	 driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");

		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step by Step");
		Thread.sleep(3000);
		GoogleSearchPage.button_search(driver).click();
		
		
		
		//		driver.findElement(By.name("btnK")).click();
		
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		
		
		driver.close();
		
		System.out.println("Test Completed successfully");
	}
	
}
