package day23.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectFlight  extends Constants{
	
	@Test
	public void selectFlightTest()
	{
		driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']"))
		                                                                        .click();
		driver.findElement(By.name("reserveFlights")).click();
	}

}
















