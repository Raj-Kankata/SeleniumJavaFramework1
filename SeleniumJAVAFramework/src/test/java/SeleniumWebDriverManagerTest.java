import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebDriverManagerTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().browserVersion("2.36.540470").setup();
		WebDriver driver = new ChromeDriver();

		//		WebDriverManager.firefoxdriver().setup();
		//		WebDriver driver = new FirefoxDriver();

		//	    WebDriverManager.phantomjs().setup();
		//	WebDriver driver = new PhantomjsDriver();
		driver.get("https://google.com");
		driver.close();
		driver.quit();


	}
}
