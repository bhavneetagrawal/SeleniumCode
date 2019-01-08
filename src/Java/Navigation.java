package Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();   //Launch Chrome
			
				driver.manage().window().maximize();  //Maximize Window
				driver.manage().deleteAllCookies();  //Delete all cookies
			
			//Dynamic Wait
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			driver.get("https://www.google.com");	
			driver.navigate().to("https://www.ebay.com");
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().forward();
			
			driver.navigate().refresh();
	}

}
