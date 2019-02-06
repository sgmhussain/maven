package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtons2 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		 driver=new FirefoxDriver(fp);
		driver.get("http://echoecho.com/htmlforms10.htm");
	}
	
	@Test
	public void radioButtonsTest()
	{
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> radio=block.findElements(By.name("group1"));
		
		for(int i=0;i<radio.size();i++)
		{
			radio.get(i).click();
		
			for(int j=0;j<radio.size();j++)
			{
				System.out.println(radio.get(j).getAttribute("value")+"--"
			                                       +radio.get(j).getAttribute("checked"));
		    }
			System.out.println("#####################################");
	    }
	}
		
	}
	



