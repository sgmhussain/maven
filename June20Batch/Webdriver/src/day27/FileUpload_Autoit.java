package day27;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class FileUpload_Autoit {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://imgur.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.className("upload-btn-text")).click();
		driver.findElement(By.className("browse-button")).click();
		Sleeper.sleepTightInSeconds(4);
		java.lang.Runtime.getRuntime().exec("c:\\users\\sai\\desktop\\upload.exe");

	}

}
