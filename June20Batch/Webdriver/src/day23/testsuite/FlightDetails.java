package day23.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FlightDetails  extends Constants{
	@Test
	public void flightDetailsTest()
	{
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		driver.findElement(By.name("passCount")).sendKeys("3");
		driver.findElement(By.name("findFlights")).click();
		
	}

}
