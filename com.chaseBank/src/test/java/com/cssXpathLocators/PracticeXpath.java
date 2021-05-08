package com.cssXpathLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeXpath {
	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.assurancewireless.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void zipCodeUsingCss() {
		
		/*from Child to parent
		 * 
		 */
		
		//driver.findElement(By.xpath("//img[@alt='More About Lifeline Service']/..")).click();
		
		/*finding an parent element with anchor tag has child 
		element with h3 tag. If we can uniquely identified 
		the child element than parent element can be identified as well
		*/ 
		
		driver.findElement(By.xpath("//a[h3[text()='Testimonials']]")).click();
	}

	@AfterTest(enabled = false)
	public void finishTest() {
		driver.quit();
	}

}
