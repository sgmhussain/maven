package day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames1 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void framesTest()
	{
		List<WebElement> myframes=driver.findElements(By.tagName("frame"));
		System.out.println(myframes.size());
		for(int i=0;i<myframes.size();i++)
		{
			driver.switchTo().frame(i);
			try
			{
				//xpath of the link in the frame
				driver.findElement(By.xpath("html/body/p[5]/b/a/font")).click();
				break;
			}
			catch(Exception e)
			{
				//switch back to the main page
				driver.switchTo().defaultContent();
			}
		}
	}

}
