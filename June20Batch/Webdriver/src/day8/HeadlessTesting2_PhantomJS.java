package day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessTesting2_PhantomJS {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.setProperty("phantomjs.binary.path","c:\\phantomjs.exe");
		
		PhantomJSDriver driver=new PhantomJSDriver();
		driver.get("http://bbc.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("c:\\users\\sai\\desktop\\bbc.png"));

	}

}
