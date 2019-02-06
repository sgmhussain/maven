package day25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DatadrivenTestingOnGrid {
	@Parameters("browser")
	@Test
	public void linkstest(String b) throws IOException
	{
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.MAC);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://newtours.demoaut.com");
		
		
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
		
		FileOutputStream f=new FileOutputStream(".\\src\\com\\inetsolv\\resultexcelfiles\\"+b+"_links.xlsx");
		wb.write(f);
	}

}
