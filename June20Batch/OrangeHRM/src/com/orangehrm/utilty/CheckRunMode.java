package com.orangehrm.utilty;

import java.io.IOException;

import org.testng.SkipException;

public class CheckRunMode {

	public void runMode(String path,int sheetno,int rowno,int colno,String msg) throws IOException
	{
		ExcelOperations eo=new ExcelOperations();
		String runMode=eo.getCellData(path,sheetno,rowno,colno);
		if(runMode.equals("N"))
			throw new SkipException(msg);
	}
	

}

