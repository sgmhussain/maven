package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StaticWebTableTesting1 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void webtableTest()
	{
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[1]";
		for(int i=1;i<=36;i++)
		{
			String x=driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(x);
		}
				
				
				
				
	}

}
