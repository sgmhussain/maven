package day29.junit;

import org.junit.Test;
import org.openqa.selenium.By;


public class SelectFlight  extends Constants{
	
	@Test
	public void selectFlightTest()
	{
		driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']"))
		                                                                        .click();
		driver.findElement(By.name("reserveFlights")).click();
	}

}
















