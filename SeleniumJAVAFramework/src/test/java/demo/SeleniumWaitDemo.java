package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	public static void main(String[] args) throws Exception {
		SeleniumWaitDemo();
	}
	
	public static void SeleniumWaitDemo() throws Exception {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver");
//		System.setProperty("webdriver.chrome.driver", projectPath+"//Test/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		250 ms - default polling time
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
//		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
		
		WebDriverWait wait  = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		driver.findElement(By.name("abcd")).click();
//		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
	}

}
