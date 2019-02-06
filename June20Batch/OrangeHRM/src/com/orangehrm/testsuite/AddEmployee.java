package com.orangehrm.testsuite;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pageclasses.AddEmployeePage;
import com.orangehrm.pageclasses.Menu;

public class AddEmployee extends BaseClass{
	@Test
	public void addEmployeeTest() throws IOException
	{
		check.runMode(dataEngine,0,2,2,"AddEmp test skipped");
		Menu menu=PageFactory.initElements(driver,Menu.class);
		AddEmployeePage addEmployeePage=PageFactory.initElements(driver,AddEmployeePage.class);
		int rowCount=eo.getRowCount(empList,0);
		for(int i=1;i<=rowCount;i++)
		{
			Row r=eo.getRowData(empList,0,i);
			menu.pim();
			Sleeper.sleepTightInSeconds(4);
			addEmployeePage.addEmployee(r);
		}
	}

}
