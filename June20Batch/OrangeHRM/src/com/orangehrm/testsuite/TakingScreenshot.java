package com.orangehrm.testsuite;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TakingScreenshot  extends BaseClass{
   @Test
   public void screenshotTest() throws IOException
   {
	   check.runMode(dataEngine,0,3,2,"Scrrenshot test skipped");
	   screen.screenshot(driver,screenshotPath+"AddEmp.png");
   }
}
