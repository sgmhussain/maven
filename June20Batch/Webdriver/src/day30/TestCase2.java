package day30;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test
	public void registrationTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WelcomeMercuryTours wm=PageFactory.initElements(driver,WelcomeMercuryTours.class);
		Menu menu=PageFactory.initElements(driver,Menu.class);
		RegisterMercuryTours rm=PageFactory.initElements(driver,RegisterMercuryTours.class);
		
		wm.register();
		rm.contactInformation();
		menu.home();
		wm.findAFlight("tutorial","tutorial");
		
		
	}

}






