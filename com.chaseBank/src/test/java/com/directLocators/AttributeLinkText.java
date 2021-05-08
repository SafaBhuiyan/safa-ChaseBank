package com.directLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeLinkText {
	
	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.instacart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void iOS_linkText_test() {
		driver.findElement(By.linkText("iOS")).click();
		driver.navigate().back();
	
		
	}
	@Test
	public void iOS_partial_LinkText() {
		driver.findElement(By.partialLinkText("View all Job")).click();
	}

	@AfterTest(enabled = false)
	public void finishTest() {
		driver.quit();
	}

}
