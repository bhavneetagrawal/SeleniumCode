package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   //Launch Chrome
		
		
			driver.manage().window().maximize();  //Maximize Window
			driver.manage().deleteAllCookies();  //Delete all cookies
		
		//Dynamic Wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.freecrm.com/register/");	
		
		//1. isDisplayed() method--Applicable for all elements
		boolean b1 = driver.findElement(By.name("submitButton")).isDisplayed();
		System.out.println(b1); //True
		
		
		//2. isEnabled() method--Applicable for all elements
			boolean b2 = driver.findElement(By.name("submitButton")).isEnabled();
			System.out.println(b2); //False
			
			// Select I agree Checkbox 
				driver.findElement(By.name("agreeTerms")).click();// Submit button is enabled now
				boolean b3 = driver.findElement(By.name("submitButton")).isEnabled();
				System.out.println(b3); //True
		
			//3 isSelected() method --Applicable for checkbox, radi obutton and drop downs
		
				boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
				System.out.println(b4); //True
		
			// De delect the checkbox
				driver.findElement(By.name("agreeTerms")).click();
				boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
						System.out.println(b5); //False
	}

}
