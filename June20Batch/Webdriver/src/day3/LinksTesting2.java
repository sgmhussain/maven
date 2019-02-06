package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinksTesting2 {
	
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=new FirefoxProfile();
		fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://bing.com");
		String expurl=driver.findElement(By.linkText("Videos")).getAttribute("href");
		driver.findElement(By.linkText("Videos")).click();
		String acturl=driver.getCurrentUrl();
		if(expurl.equals(acturl))
		{
			System.out.println("Videos link is working correctly");
		}
		else
		{
			System.out.println("Videos link is not working correctly");
		}
		driver.close();

	}

}


