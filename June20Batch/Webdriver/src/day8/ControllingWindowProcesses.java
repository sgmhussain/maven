package day8;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ControllingWindowProcesses {

	public static void main(String[] args) {
		WindowsUtils.killByName("firefox.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		Sleeper.sleepTightInSeconds(5);
		driver.close();
		Sleeper.sleepTightInSeconds(5);
		WindowsUtils.killByName("eclipse.exe");
	}

}
