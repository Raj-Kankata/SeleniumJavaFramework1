package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch () {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vijayamacbook/eclipse-workspace/SeleniumJAVAFramework/drivers/chromedriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).sendKeys(Keys.RETURN);
		
		
		driver.close();
		
		System.out.println("Test Completed successfully");
	}
	
}
