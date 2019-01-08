package Java;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //Launch Chrome
		
			driver.manage().window().maximize();  //Maximize Window
			driver.manage().deleteAllCookies();  //Delete all cookies
		
		//Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.quackit.com/html/html_editors/scratchpad/?example=/javascript/examples/javascript_popup_window_onclick");	
		driver.findElement(By.xpath("//*[@id=\"go\"]")).click();
		
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String ParentWindowId = it.next();
		System.out.println("Parent window id:"+ParentWindowId);
		
		String ChildWindowId = it.next();
		System.out.println("Child window id:"+ChildWindowId);
		
		driver.switchTo().window(ChildWindowId);
		Thread.sleep(2000);
		System.out.println("Child window title :"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(ParentWindowId);
		Thread.sleep(2000);
		System.out.println("Parent window title :"+driver.getTitle());
		
		//1. Alert--JavaScript pop up.....Alert API(accept,dismiss)
		//2. File Upload pop ups...Browse Button(sendKey(Path))
		//3. Browsers window pop ups....Advertisement pop up...getWindowhandles()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
