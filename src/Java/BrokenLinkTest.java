package Java;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //Launch Chrome
		
			driver.manage().window().maximize();  //Maximize Window
			driver.manage().deleteAllCookies();  //Delete all cookies
		
		//Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.ebay.com");	
		
		// To click on link using contains function
		 
		//driver.findElement(By.xpath("//a[contains(text(),'Advanced')]")).click();
		
		// Get the total count of links
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of Full Links and Image-->"+linkList.size());
		
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		for(int i=0; i<linkList.size(); i++)
		{
			System.out.println(linkList.get(i).getAttribute("href"));
			if(linkList.get(i).getAttribute("href") !=null && (! linkList.get(i).getAttribute("href").contains("javascript")))
			{
				activeLinks.add(linkList.get(i));
			}
				
		}
		
		System.out.println("Size of Active Links and Image-->"+activeLinks.size());
		
		for(int j=0; j<=activeLinks.size(); j++)
		{
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"--->"+response);
			
			
			
		}
		
		
		
	}

}
