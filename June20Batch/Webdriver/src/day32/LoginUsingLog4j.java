package day32;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginUsingLog4j {

	private static Logger log=Logger.getLogger(LoginUsingLog4j.class);
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Browser Launched");
		driver.get("http://yahoomail.com");
		log.info("Navigated to Yahoomail");
		driver.findElement(By.name("username")).sendKeys("saikrishna_rhce");
		log.info("Entered username");
		driver.findElement(By.id("login-signin")).click();
		log.info("Clicked on next");
		driver.findElement(By.id("login-passwd")).sendKeys("krishna");
		driver.findElement(By.id("login-signin")).click();
		

	}

}
