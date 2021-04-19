package com.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributesId {

	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//@Test()
	public void logIn() {
//	driver.findElement(By.id("email")).sendKeys("jjjj");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("uuuu");
//	driver.findElement(By.name("email")).sendKeys("hhhhh");
//	driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("ooooo");
		driver.findElement(By.id("pass")).sendKeys("123");
//	System.out.println("give control");
//	driver.findElement(By.name("login")).click();
	}
	
	@Test 
	public void signinContainTextest() {
		WebElement text=driver.findElement(By.xpath("//*[contains(text(),'Connect with friends and the world')]"));
		String text1=text.getText();
	System.out.println(text1);
	}

	@AfterTest(enabled = false)
	public void finishTest() {
		driver.quit();
	}

}
