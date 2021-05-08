package com.cssXpathLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeCssLocators {
	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://www.assurancewireless.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void zipCodeUsingCss() {
		//driver.findElement(By.xpath("(//input[@class='main-zip zip' or @placeholder='Enter Zip Code'])[1]")).sendKeys("13215");
		//driver.findElement(By.xpath("(//li[@class='dropdown'])[3]//following::a")).click();
//		
//		for(String winHandle : driver.getWindowHandles()){
//		    driver.switchTo().window(winHandle);
//		}
		//driver.findElement(By.cssSelector("input[id='min']")).sendKeys("13455");
		//driver.findElement(By.cssSelector("button[id='submit']")).click();
//		WebElement getText=driver.findElement(By.cssSelector("div[class^='zipbar-text-']"));
//		String text = getText.getText();
//		System.out.println(text);
		//driver.findElement(By.xpath("(//div[@class='home-icon-area']/a)[1]")).click();
		driver.findElement(By.cssSelector("ul[class='uiList pageFooterLinkList _509- _4ki _703 _6-i']>li:last-child")).click();
	
	}

	@AfterTest(enabled = false)
	public void finishTest() {
		driver.quit();
	}

}
