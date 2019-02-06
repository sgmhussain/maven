package day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshots {

	
	public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		/*TakesScreenshot screen=(TakesScreenshot)driver;
		File srcFile=screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("c:\\users\\sai\\desktop\\google.png"));*/
		
		
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("c:\\users\\sai\\desktop\\google.png"));
		
		
		//FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),new File("c:\\users\\sai\\desktop\\google.png"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
