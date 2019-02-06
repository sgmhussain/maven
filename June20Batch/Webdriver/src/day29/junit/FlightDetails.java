package day29.junit;

import org.junit.Test;
import org.openqa.selenium.By;


public class FlightDetails  extends Constants{
	@Test
	public void flightDetailsTest()
	{
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		driver.findElement(By.name("passCount")).sendKeys("3");
		driver.findElement(By.name("findFlights")).click();
		
	}

}
