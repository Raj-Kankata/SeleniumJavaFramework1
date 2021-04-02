import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesirredCapabilities_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver(caps);

		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
		
		driver.close();
		driver.quit();
		
	}

}
