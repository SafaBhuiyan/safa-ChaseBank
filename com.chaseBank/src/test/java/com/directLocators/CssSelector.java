package com.directLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {
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
	public void zipCodeUsingCss() {
		driver.findElement(By.cssSelector("#address_line_1")).sendKeys("13215");
		//driver.findElement(By.cssSelector("button.rmq-731d2f0d")).click();
		driver.findElement(By.cssSelector("button[class*='731d2f0d']")).click();
	//driver.findElement(By.xpath("(//button[@class='rmq-731d2f0d' or @type='button'])[1]")).click();
	}

	@AfterTest(enabled = false)
	public void finishTest() {
		driver.quit();
	}

}
