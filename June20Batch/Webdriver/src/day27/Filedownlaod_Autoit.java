package day27;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Filedownlaod_Autoit {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.53.1")).click();
		Sleeper.sleepTightInSeconds(4);
		java.lang.Runtime.getRuntime().exec("c:\\users\\sai\\desktop\\download.exe");

	}

}
