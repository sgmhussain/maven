package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SliderAutomation {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/#slider-vertical");
		driver.manage().window().maximize();
	}
	
	@Test
	public void sliderTest()
	{
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
		//xpath of the slider
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
		int x=slider.getLocation().x;
		int y=slider.getLocation().y;
		System.out.println(x+"---"+y);
		action.dragAndDropBy(slider,30,y).build().perform();
	}

}
