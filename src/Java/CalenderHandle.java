package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderHandle {

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
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		//Thread.sleep(3000);																						
		
		driver.switchTo().frame("mainpanel");
		
		String Date = "32   -December-2018";
		String DateArr[] = Date.split("-");
		String Day = DateArr[0];
		String Month = DateArr[1];
		String Year = DateArr[2];
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(Month);
		
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(Year);
		
		 //*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		
		String beforeXpath = "//*[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath = "]/td[";
		
		final int totalWeekDays = 7;
		boolean flag = false;
		String dayVal = null;
		
		
		for(int rowNum=2; rowNum<=7; rowNum++)
		{
			for(int colNum=1; colNum<=totalWeekDays; colNum++)
			{
				//try
				//{
				dayVal = driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
				//}
				//catch(NosuchElementException e)
			//	{
			//		System.out.println("Please enter a correct date");
			//		flag = true;
			//		break;
				//}
				System.out.println(dayVal);
				if(dayVal.equals(Day))
				{
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					flag = true;
					break;
				}
			}
			if(flag)
			{
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
