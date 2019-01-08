package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderByJavascriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //Launch Chrome
		
			driver.manage().window().maximize();  //Maximize Window
			driver.manage().deleteAllCookies();  //Delete all cookies
		
		//Dynamic Wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.spicejet.com/");	
			
		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateVal = "27-12-2018";
		
				selectDateByJS(driver, date, dateVal);
		

	}

	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeAsyncScript("arguments[0].setAttribute('Value','"+dateVal+"')",  element);
}


}