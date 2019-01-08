package Java;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //Launch Chrome
		
			driver.manage().window().maximize();  //Maximize Window
			driver.manage().deleteAllCookies();  //Delete all cookies
		
		//Dynamic Wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.freecrm.com");	
		
		driver.findElement(By.name("username")).sendKeys("bagrawal");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		//Thread.sleep(3000);																						
		
		//driver.switchTo().frame("mainpanel");
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		
		
		
		
		
		
		
		
	}

}
