package com.orangehrm.pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class Menu {
	@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']/b")
	WebElement admin;
	public void admin()
	{
		admin.click();
	}
	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']/b")
	WebElement pim;
	public void pim()
	{
		pim.click();
	}
	@FindBy(xpath="//*[@id='menu_leave_viewLeaveModule']/b")
	WebElement leave;
	public void leave()
	{
		leave.click();
	}
	@FindBy(xpath="//*[@id='menu_time_viewTimeModule']/b")
	WebElement time;
	public void time()
	{
		time.click();
	}
	@FindBy(xpath="//*[@id='menu_recruitment_viewRecruitmentModule']/b")
	WebElement recruitment;
	public void recruitment()
	{
		recruitment.click();
	}
	@FindBy(xpath="//*[@id='menu__Performance']/b")
	WebElement performance;
	public void performance()
	{
		performance.click();
	}
	@FindBy(xpath="//*[@id='menu_dashboard_index']/b")
	WebElement dashboard;
	public void dashboard()
	{
		dashboard.click();
	}
	@FindBy(xpath="//*[@id='menu_directory_viewDirectory']/b")
	WebElement directory;
	public void directory()
	{
		directory.click();
	}
	@FindBy(linkText="Welcome Admin")
	WebElement welcomeAdmin;
	@FindBy(linkText="About")
	WebElement about;
	@FindBy(linkText="Logout")
	WebElement logout;
	public void about()
	{
		welcomeAdmin.click();
		about.click();
	}
	
	public void logout()
	{
		Sleeper.sleepTightInSeconds(4);
		welcomeAdmin.click();
		Sleeper.sleepTightInSeconds(3);
		logout.click();
	}

}
