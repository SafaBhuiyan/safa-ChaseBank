package com.actionPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionKeyBoardEvents {
	
	
	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void enterKeycheck() {
		Actions action =new Actions(driver);
		driver.findElement(By.cssSelector("[id^='u_0_2']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("gggg");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("jjjj");
		
	action.sendKeys(Keys.ENTER).build().perform();


	}

	@AfterTest(enabled = false)
	public void finishTest() {
		driver.quit();
	}

}
