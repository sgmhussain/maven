package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XpathCreation3 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://facebook.com");
	}
	
	@Test
	public void xpathTest()
	{
		Sleeper.sleepTightInSeconds(7);
		List<WebElement> inputFields=driver.findElements(By.xpath
				    ("//input[@type='text' or @type='password' or @type='email']"));
		String[] str={"one","two","three","four","five","six","seven","eight"};
		System.out.println(inputFields.size());
		for(int i=0;i<inputFields.size();i++)
		{
			inputFields.get(i).sendKeys(str[i]);
		}
	}

}









