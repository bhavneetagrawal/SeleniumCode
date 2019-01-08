package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleValidationTest {

WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();   //Launch Chrome
		
			driver.manage().window().maximize();  //Maximize Window
			driver.manage().deleteAllCookies();  //Delete all cookies
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.google.com");	
	}
	
	@Test
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google", "Title is not matched");
		//Assert.assertEquals(title, "Google123", "Title is not matched");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
}
