package variables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox {
	public WebDriver driver;

	@BeforeTest
	public void opecBrowser() {
		WebDriverManager.firefoxdriver().setup();
		;
		driver = new FirefoxDriver();
		driver.get("https://www.chase.com/");
	}

	@Test
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("The Title is: " + title);
	}

	@Test
	public void getUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("The url is: " + url);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
