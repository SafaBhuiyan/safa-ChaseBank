package com.actionPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionMouseHover {
	
	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.assurancewireless.com/");
		//driver.get("https://www.assurancewireless.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void dropdownXpath() {
		Actions action =new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[@class='mainMenuBtn']"));
	
		
		action.moveToElement(element).build().perform();
		
		List<WebElement> items = driver.findElements(By.xpath("(//ul[@class='dropdown-menu'])[3]/li"));
		System.out.println(items.size());
		for (WebElement webElement : items) {
			System.out.println(webElement.getText());
			//System.out.println(webElement.getAttribute("innerHTML"));
		}
		//action.moveToElement(element).click().build().perform();
//	
//		WebElement element1= driver.findElement(By.linkText("Check Availability"));
//		action.moveToElement(element1);
//		action.click().build().perform();
//		System.out.println(driver.getCurrentUrl());


	}

	@AfterTest(enabled = false)
	public void finishTest() {
		driver.quit();
	}


}
