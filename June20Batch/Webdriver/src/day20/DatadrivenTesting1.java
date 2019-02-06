package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenTesting1 {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void linksTest() throws IOException
	{
		FileInputStream file=new FileInputStream(".\\src\\com\\inetsolv\\excelfiles\\links.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		int rowCount=ws.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			r=ws.getRow(i);
			String linkname=r.getCell(0).getStringCellValue();
			try
			{
				driver.findElement(By.linkText(linkname)).click();
				String acturl=driver.getCurrentUrl();
				r.createCell(2).setCellValue(acturl);
				String expurl=r.getCell(1).getStringCellValue();
				if(expurl.equals(acturl))
				{
					r.createCell(3).setCellValue("Passed");
				}
				else
				{
					r.createCell(3).setCellValue("Failed");
				}
				driver.navigate().back();
			}
			catch(Exception e)
			{
				r.createCell(3).setCellValue("Link not found");
			}
			
		}
		
		FileOutputStream f=new FileOutputStream(".\\src\\com\\inetsolv\\resultexcelfiles\\links.xlsx");
		wb.write(f);
		wb.close();
		
		
		
		
		
	}

}
