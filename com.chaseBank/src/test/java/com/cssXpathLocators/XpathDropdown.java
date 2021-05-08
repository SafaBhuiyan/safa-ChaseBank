package com.cssXpathLocators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDropdown {

	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
		//driver.get("https://www.assurancewireless.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void dropdownXpath() {
//		Actions action =new Actions(driver);
//		WebElement element = driver.findElement(By.linkText("Lifeline Service"));
//		
//		action.moveToElement(element).build().perform();
//	
//		WebElement element1= driver.findElement(By.linkText("Check Availability"));
//		action.moveToElement(element1);
//		action.click().build().perform();
//		System.out.println(driver.getCurrentUrl());

		WebElement element = driver.findElement(By.id("cars"));
		Select select = new Select(element);
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(2);

		List<WebElement> elements = select.getAllSelectedOptions();
		for (WebElement ele : elements) {
			System.out.println(ele.getText());

		}

	}

	@AfterTest(enabled = false)
	public void finishTest() {
		driver.quit();
	}

}
