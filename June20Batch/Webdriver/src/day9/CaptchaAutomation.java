package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class CaptchaAutomation {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		int b=1;
		while(b<=10)
		{
			driver.get("http://www.harvard.edu/feedback");
			//id of the name field
			driver.findElement(By.id("edit-submitted-name")).sendKeys("Tester1");
			//id of the email field
			driver.findElement(By.id("edit-submitted-email")).sendKeys
			                                                 ("tester@gmail.com");
			//id of the comment field
			driver.findElement(By.id("edit-submitted-comment")).sendKeys
			                                        ("Stupid change the capthca");
			//class of the math equation
			String x=driver.findElement(By.className("field-prefix")).getText();
			//split the math equation based on spaces
			String[] a=x.split(" ");
			//convert into int and perform addition
			int i=Integer.parseInt(a[0]);
			int j=Integer.parseInt(a[2]);
			int k=i+j;
			//conver the added result into string
			String str=Integer.toString(k);
			//id of the maths equation result field
			driver.findElement(By.id("edit-captcha-response")).sendKeys(str);
			Sleeper.sleepTightInSeconds(6);
			//driver.findElement(By.name("op")).click();
		}
		

	}

}
