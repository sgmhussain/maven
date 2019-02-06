package day14;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindows1 {
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
		String title1=driver.getTitle();
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			String title2=driver.getTitle();
			if(!title1.equals(title2))
			{
				driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
				break;
			}
		}
		
		
		
	}

}
