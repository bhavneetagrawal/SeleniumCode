package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //Launch Chrome
		driver.get("http://www.google.com");	// Enter URL
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals("Google"))
		{
			System.out.println("Correct");
		}
		
		else
		{
			System.out.println("Incorrect");
		}
		
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
