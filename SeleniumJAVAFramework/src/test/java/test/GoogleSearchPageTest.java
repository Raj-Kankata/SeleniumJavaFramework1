package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagesPOM.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/vijayamacbook/eclipse-workspace/SeleniumJAVAFramework/drivers/chromedriver/chromedriver");
		 driver = new ChromeDriver();
		 
		 GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		 
		 driver.get("https://google.com/");
		 
		 searchPageObj.setTextInsearchBox("A B C D");
		 Thread.sleep(3000);
		 searchPageObj.clickSearchButton();
		 
		 driver.close();
	}
	
	
}

