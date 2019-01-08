package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();   //Launch Chrome
		
		//Advantages
		// Testing behind the scene---No browser invoke
		// Very fast execution of testcase --Performance increased
		// Not suitable for User actions class--MouseMovement, DobleClick, Drag and Drop
		// Ghost Driver---Headless Browser
		// HtmlUnitDriver ====Jave
		// PhantomJS===JavaScipt
		
		
		
		WebDriver driver = new HtmlUnitDriver();
		
			driver.manage().window().maximize();  //Maximize Window
			driver.manage().deleteAllCookies();  //Delete all cookies
		
		//Dynamic Wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.freecrm.com");	
		
		System.out.println("Before login Title"+driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("bagrawal");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		System.out.println("After login Title"+driver.getTitle());

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
