package day13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FluentwaitExample {


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
			//fluent wait object
			FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver).withTimeout(50,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
			
			fwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[1]/div/div/div/span/a")));
			fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a"))).click();
			
		}
		

	}


