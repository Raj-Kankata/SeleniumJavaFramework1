import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath :"+projectPath);
		
//		System.setProperty("webdriver.gecko.driver", projectPath+"//drivers/geckodriver/geckodriver");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.ie.driver", projectPath);
//		WebDriver driver = new InternetExplorerDriver();
		
		
		driver.get("http://google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		List <WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		
		int count = listOfInputElements.size();
		System.out.println("Count of Input elements :"+count);
		
		WebElement txtBox = driver.findElement(By.xpath("//*[@id=\"input\"]"));
		txtBox.sendKeys("Automation step by step");
		
		
		
		Thread.sleep(3000);
		driver.close();
	}
}
