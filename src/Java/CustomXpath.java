package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //Launch Chrome
		
		
		driver.manage().window().maximize();  //Maximize Window
		driver.manage().deleteAllCookies();  //Delete all cookies
		
		driver.get("https://www.ebay.com");	// Enter URL
		
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Mobile");
		
		driver.findElement(By.xpath("//input[contains(@name,'_nkw')]")).sendKeys("Mobile");
		
		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[ends-with(@id,'_test')]")).sendKeys("Mobile");
		
		
		//id = test_123
		//id = test_234
		//id = test_345
		
		//id = 123_test
		//id = 234_test		
		//id = 345_test
		
		
	}

}
