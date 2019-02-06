package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XpathCreation {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		 driver=new FirefoxDriver();
		driver.get("http://gmail.com");
	}
	
	@Test
	public void xpathTest()
	{
		//xpath of 'One Google account for everything Google'
		String x=driver.findElement(By.xpath("//p[@class='tagline']")).getText();
		System.out.println(x);
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}



