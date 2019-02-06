package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ChromeLaunch {

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://bing.com");
		
		driver.findElement(By.linkText("Help")).click();
	}

}












