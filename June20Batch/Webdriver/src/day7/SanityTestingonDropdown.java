package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanityTestingonDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement drop=driver.findElement(By.name("country"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		int i=randomNoGenerator(dropdown.size()-1);
		dropdown.get(i).click();
		if(dropdown.get(i).isSelected())
		{
			System.out.println(dropdown.get(i).getText()+" is active");
		}
		else
		{
			System.out.println(dropdown.get(i).getText()+" is inactive");
		}
		driver.close();
	}
	
	public static int randomNoGenerator(int x)
	{
		double d=Math.random()*x;
		int i=(int)d;
		return i;
		
	}

}
