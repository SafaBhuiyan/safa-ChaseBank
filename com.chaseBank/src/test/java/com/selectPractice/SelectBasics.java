package com.selectPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectBasics {

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
	public void selectDropdown() {
		driver.findElement(By.cssSelector("[id^='u_0_2']")).click();
		WebElement element = driver.findElement(By.cssSelector("[id='month']"));
		Select select = new Select(element);
		// select.selectByIndex(2);
		   select.selectByValue("2");
		// select.selectByVisibleText("Oct");

		List<WebElement> elements = driver.findElements(By.xpath("//select[@id='month']/option[not(@value='0')]"));
		System.out.println(elements.size());
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
		}

//		elements.get(2).click();
//		Assert.assertEquals(elements.get(2).getText(), "Mar");

//		for(int i=0; i<elements.size();i++) {
//			
//			if(elements.get(i).getText().equals("Dec")) {
//				elements.get(i).click();
//				break;
//			}
//			
//		System.out.println(elements.get(i).getText());
//			
//		}

	}

	@AfterTest(enabled = false)
	public void finishTest() {
		driver.quit();
	}

}
