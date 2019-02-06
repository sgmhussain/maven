package com.orangehrm.pageclasses;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePage {
	@FindBy(linkText="Add Employee")
	WebElement addEmployee;
	@FindBy(id="firstName")
	WebElement firstName;
	@FindBy(id="middleName")
	WebElement middleName;
	@FindBy(id="lastName")
	WebElement lastName;
	@FindBy(id="employeeId")
	WebElement employeeId;
	@FindBy(id="chkLogin")
	WebElement createLoginDetails;
	@FindBy(id="user_name")
	WebElement userName;
	@FindBy(id="user_password")
	WebElement password;
	@FindBy(id="re_password")
	WebElement confirmPassword;
	@FindBy(id="status")
	WebElement status;
	@FindBy(id="btnSave")
	WebElement save;
	public void addEmployee(Row r)
	{
		addEmployee.click();
		Sleeper.sleepTightInSeconds(4);
		firstName.sendKeys(r.getCell(0).getStringCellValue());
		middleName.sendKeys(r.getCell(1).getStringCellValue());
		lastName.sendKeys(r.getCell(2).getStringCellValue());
		employeeId.sendKeys(r.getCell(3).getStringCellValue());
		if(r.getCell(4).getStringCellValue().equals("Y"))
		{
			if(!createLoginDetails.isSelected())
					createLoginDetails.click();
			userName.sendKeys(r.getCell(5).getStringCellValue());
			password.sendKeys(r.getCell(6).getStringCellValue());
			confirmPassword.sendKeys(r.getCell(7).getStringCellValue());
			status.sendKeys(r.getCell(8).getStringCellValue());
				
		}
		else 
		{
			if(createLoginDetails.isSelected())
				createLoginDetails.click();
		}
		save.click();
		
	}
	

}
