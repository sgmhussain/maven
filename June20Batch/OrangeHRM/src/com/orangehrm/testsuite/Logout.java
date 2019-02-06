package com.orangehrm.testsuite;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pageclasses.Menu;

public class Logout  extends BaseClass{
	
	@Test
	public void logout() throws IOException
	{
		Menu menu=PageFactory.initElements(driver,Menu.class);
		check.runMode(dataEngine,0,4,2,"Logout test skipped");
		menu.logout();
	}

}
