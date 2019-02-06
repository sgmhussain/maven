package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitwaitExample {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://www.pvrcinemas.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void waitTest()
	{
		WebDriverWait mywait=new WebDriverWait(driver,40);
		mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[1]/div/div/div/span/a")));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a"))).click();
		
	}

}
