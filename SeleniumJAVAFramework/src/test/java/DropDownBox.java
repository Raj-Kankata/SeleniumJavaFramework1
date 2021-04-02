import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBox {
public static void main(String[] args) throws Exception {
	

	String projectPath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectPath+"//drivers/chromedriver/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://gcreddy.com/project/create_account.php");

		boolean displayStatus = driver.findElement(By.name("country")).isDisplayed();
		System.out.println(displayStatus);//true

		boolean enabledStatus = driver.findElement(By.name("country")).isEnabled();
		System.out.println(enabledStatus);//true

		Select dropdown = new Select (driver.findElement(By.name("country")));
		//dropdown.selectByIndex(6);

		dropdown.selectByVisibleText("India");
		Thread.sleep(4000);

		List e = dropdown.getOptions();
		System.out.println(e.size());
		driver.close();
	
	
}
}
