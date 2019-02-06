package day10;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	//setting priority to test cases
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	@Test(priority=1)
	public void registration()
	{
		System.out.println("This is for registration");
	}
	//ignoring test cases
	@Test(enabled=false)
	public void logoutTest()
	{
		System.out.println("This is for logout app");
	}
	@BeforeMethod
	public void function()
	{
		System.out.println("ABCD");
	}

}
