import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class YahooLogin {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoomail.com");
		driver.findElement(By.name("username")).sendKeys("saikrishna_rhce");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("krishna");
		driver.findElement(By.id("login-signin")).click();
		

	}

}
