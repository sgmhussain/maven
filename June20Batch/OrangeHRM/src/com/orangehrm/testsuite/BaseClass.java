package com.orangehrm.testsuite;

import org.openqa.selenium.WebDriver;

import com.orangehrm.utilty.CapturingScreenshots;
import com.orangehrm.utilty.CheckRunMode;
import com.orangehrm.utilty.ExcelOperations;

public class BaseClass {
	static WebDriver driver=null;
	ExcelOperations eo=new ExcelOperations();
	CapturingScreenshots screen=new CapturingScreenshots();
	CheckRunMode check=new CheckRunMode();
	String empList=".\\src\\com\\orangehrm\\excelfiles\\EmployeeList.xlsx";
	String dataEngine=".\\src\\com\\orangehrm\\dataEngine\\DataEngine.xlsx";
	String screenshotPath=".\\src\\com\\orangehrm\\screenshots\\";
}
