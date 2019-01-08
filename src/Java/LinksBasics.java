package Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;			
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //Launch Chrome
		
			driver.manage().window().maximize();  //Maximize Window
			driver.manage().deleteAllCookies();  //Delete all cookies
		
		//Dynamic Wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.ebay.com");	
		
		// To click on link using contains function
		 
		//driver.findElement(By.xpath("//a[contains(text(),'Advanced')]")).click();
		
		// Get the total count of links
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());
		
		for(int i=0; i<linkList.size(); i++)
		{
				String LinkText = linkList.get(i).getText();
				System.out.println(LinkText);
				
		}
		
	
		
	
	}

}
