package com.xPathLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathContain {
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
	public void clickLogIn() {
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("vvvvv");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("123456");
	}
	
	@AfterTest(enabled=false)
	public void finishTest() {
		driver.quit();
	}

}
