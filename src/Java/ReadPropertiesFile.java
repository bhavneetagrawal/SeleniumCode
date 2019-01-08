package Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertiesFile {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\SeleniumBasic\\src\\Java\\test.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String BrowserName = prop.getProperty("browser");
		System.out.println(BrowserName);
		
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();   //Launch Chrome
		}
		else if(BrowserName.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();   //Launch FF
		}
		else if(BrowserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\Downloads\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();   //Launch Edge
		}
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 
}
 