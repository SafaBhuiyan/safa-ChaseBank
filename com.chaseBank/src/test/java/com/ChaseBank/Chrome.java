package com.ChaseBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {
	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.chase.com/");
	}

	@Test
	public void getTitle() {

		String title = driver.getTitle();
		System.out.println("The Title is: " + title);
	}

	@Test
	public void geturl() {
		String url = driver.getCurrentUrl();
		System.out.println("The Url is: " + url);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
