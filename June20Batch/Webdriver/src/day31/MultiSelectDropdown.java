package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement drop=driver.findElement(By.name("cars"));
		Select select=new Select(drop);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		driver.findElement(By.xpath("html/body/form/input")).click();
	}

}
