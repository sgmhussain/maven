package day31;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindowsandTabs {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void multipleWindowTest()
	{
		
		driver.findElement(By.linkText("Help")).click();
		switchWindow("//*[@id='privacyLabel']");
		Sleeper.sleepTightInSeconds(5);
		switchWindow("//*[@id='mainotherimportantprivacyinformationmodule_ShortDescription']/label/p/a");
		
	}
	public void switchWindow(String x)
	{
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			try
			{
				driver.findElement(By.xpath(x)).click();
				break;
			}
			catch(Exception e)
			{
				
			}
		}
		
	}

}
