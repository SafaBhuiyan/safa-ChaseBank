package com.xPathLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathOrAnd {
	
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
	public void orAndxPathTest() {
		driver.findElement(By.xpath("//input[@id='address_line_1']")).sendKeys("13215");
		driver.findElement(By.xpath("//button[@type='submit' or text()='Get started']")).click();
		driver.findElement(By.xpath("//input[starts-with(@id,'nextgen') and contains(@name,'email')]")).sendKeys("ggggg");
	}

	@AfterTest(enabled = false)
	public void finishTest() {
		driver.quit();
	}

}
