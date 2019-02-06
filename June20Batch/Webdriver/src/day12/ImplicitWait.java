package day12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplicitWait {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.pvrcinemas.com/");
	}
	
	@Test
	public void waitTest()
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//xpath of the second movie play button
		driver.findElement(By.xpath
			("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a")).click();
	}

}
