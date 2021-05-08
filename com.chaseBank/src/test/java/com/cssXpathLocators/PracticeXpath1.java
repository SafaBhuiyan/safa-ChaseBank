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

public class PracticeXpath1 {
	
	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://theautomationzone.blogspot.com/2020/07/sample-webtable-3.html");
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void advancedXpaths() {
		
		/*
		 * Selecting any row of a Table using Last function
		 */
		//driver.findElement(By.xpath("//table[@id='table1']//tr[last()-4]/td/input")).click();
		
		/*
		 * Use of count function
		 * Finding an Webtable having tr element (no of rows) is 6
		 * //table[count(.//tr)=8]
		 */
		
		/*
		 * Use of Normalize-Space function 
		 * Xpath is dependent on spaces between texts
		 * How to make Xpath independent of text Spaces
		 * Normalized Space function is only gonna remove the preceding and 
		 * Trailing spaces not in between spaces 
		 */
		
//		driver.findElement(By.xpath("//button[text()='Preceding Space' and @type='button']")).click();
//		WebElement text=driver.findElement(By.xpath("//p[normalize-space(text())='Tommy']"));
//		String text1= text.getText();
//		System.out.println(text1);
		
		
		/*
		 * Use of Translate Function
		 * making xpath case insensitive 
		 * converting from Lower case to Upper case and vice versa
		 * //p[translate(text(), "ABC.....z", "abc....z")='tommy']
		 */
		
		/*
		 * Use of String-length function
		 * We can find a paragraph or text which has 
		 * more than or less than a certain number of 
		 * characters 
		 * //p[string-length(text())>30]
		 */
		
		/* Use of round function 
		 * it will rounding up the number 
		 * //td[round(text())='4']
		 * 
		 */
		/*Use of not Function 
		 * when there are two element we can use the not function 
		 * to remove that element 
		 * //input[@type='radio' and not (@id='gender-1')]
		 */
	}

	@AfterTest(enabled = false)
	public void finishTest() {
		driver.quit();
	}

}
