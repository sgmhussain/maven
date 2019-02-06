package day3;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfiles {

	
	public static void main(String[] args) {
		//create a profiles object
		ProfilesIni pr=new ProfilesIni();
		//create a firefoxprofile object and point it to the "MyPrfile"
		//that we created
		FirefoxProfile fp=pr.getProfile("MyProfile");
		//Launch firefox along with the profiles
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://msn.com");

	}

}







