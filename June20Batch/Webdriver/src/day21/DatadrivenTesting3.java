package day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenTesting3 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://care.ideacellular.com/wps/portal/account/express-paybill?gclid=CJeN4ouEgc4CFdCIaAodPr0HXw#Z7_JH56H4K0K8MP90AS8PIGS60CN3");
		driver.manage().window().maximize();
	}
	
	@Test
	public void ajaxTest() throws IOException
	{
		FileInputStream file=new FileInputStream(".\\src\\com\\inetsolv\\excelfiles\\ajaxdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		int rowCount=ws.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			r=ws.getRow(i);
			String phno=r.getCell(0).getStringCellValue();
			driver.findElement(By.name("mobileNumber")).clear();
			driver.findElement(By.name("mobileNumber")).sendKeys(phno);
			driver.findElement(By.name("amountPaid")).click();
			WebElement ajax=driver.findElement(By.xpath("//*[@id='errorHolder']/label"));
			String actajax=null;
			if(ajax.getText().isEmpty())
			{
				actajax="No Ajax";
			}
			else
			{
				actajax=ajax.getText();
			}
			r.createCell(2).setCellValue(actajax);
			String expajax=r.getCell(1).getStringCellValue();
			if(expajax.equals(actajax))
			{
				r.createCell(3).setCellValue("Passed");
			}
			else
			{
				r.createCell(3).setCellValue("Failed");
			}
		}
		FileOutputStream f=new FileOutputStream(".\\src\\com\\inetsolv\\resultexcelfiles\\Ajaxdata.xlsx");
		wb.write(f);
			
	}		
			
			
			
			
			
			
			
			
			
			
			
			
			
		

}
