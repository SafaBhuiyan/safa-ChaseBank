package com.xPathLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathStartsWith {

	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.instacart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test()
	public void startsWithXpath() {
		driver.findElement(By.xpath("//button[starts-with(@class,'rmq')]")).click();
		driver.findElement(By.xpath("(//input[starts-with(@id,'nextgen')])[1]")).sendKeys("uyehdhd");
	}

	@AfterTest(enabled = false)
	public void finishTest() {
		driver.quit();
	}

}
