package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //Launch Chrome
		driver.get("https://courses.edx.org/register");	// Enter URL
		
		//driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select");
		// Xpath
			driver.findElement(By.xpath("//*[@id=\"register-email\"]")).sendKeys("Bhavneet");
		
		//ID
			//driver.findElement(By.id("register-email")).sendKeys("Bhavneet");
		
		//Name
			//driver.findElement(By.name("email")).sendKeys("Bhavneet");

		//LinkText
			//driver.findElement(By.linkText("Sign in.")).click();
			
		//PartialLinkText
			//driver.findElement(By.partialLinkText("Sign")).click();
			
		//CSSSelector
			//If ID is there ---- #id
			//If class is there ----.class
			//driver.findElement(By.cssSelector("#register-name")).sendKeys("Bhavneet");
			
		//className
			//driver.findElement(By.className("input-block error")).sendKeys("Bhavneet");
			
		//Handle Dropdown
			
			Select select = new Select(driver.findElement(By.id("pet-select")));
			select.selectByVisibleText("hamster");
			
}
}