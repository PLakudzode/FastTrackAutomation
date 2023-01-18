package POMFramework;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import KeyWords_BrowserOpen_Logout.LogIn_LogOut;
import KeyWords_BrowserOpen_Logout.UIKeyWords;
import POMPages.AdminPage;

public class AdminTC extends LogIn_LogOut {
	AdminPage adminpage = new AdminPage();
	public static Logger log = Logger.getLogger(AdminTC.class);
	
	@Test(priority = 0)
	public void AdminTabOpen() throws IOException, InterruptedException {
		adminpage.AdminTabOpen();
		UIKeyWords.takeScreenShots("AdminPageOpen");
		log.info("Admin Page Open Sucessfully");
	}
	
	@Test(priority = 1)
	public void AdminEnterUserManagement() throws IOException, InterruptedException {
		adminpage.AdminTabOpen();
		adminpage.AdminTab_EnterUsername();
		adminpage.UserRoleDropDown();
		adminpage.UserClickOnRole();
		adminpage.ClickOnStatusDropDown();
		adminpage.ClickOnstatus();
		adminpage.ClickOnSearchButton();
		UIKeyWords.takeScreenShots("AdminEnterUserManagement");
		log.info("Admin Enter UserManagement Sucessfully");
	}

	@Test(priority = 2)
	public void JobTitleOpen() throws IOException, InterruptedException {
		adminpage.AdminTabOpen();
		adminpage.Job();
		adminpage.JobTitle();
		UIKeyWords.takeScreenShots("JobTitleADD");
		log.info("Job Title Open Sucessfully");
	}

	@Test(priority = 3)
	public void JobTitleADD() throws AWTException, IOException, InterruptedException {
		adminpage.AdminTabOpen();
		adminpage.Job();
		adminpage.JobTitle();
		adminpage.ClickOnADDButton();
		adminpage.EnterJobTitle();
		adminpage.EnterJobDescription();
		UIKeyWords.pagedown(2);
		adminpage.EnterNote();
		adminpage.ClickOnSaveButton();
		adminpage.ClickOnDeleteButton();
		adminpage.ClickOnYESDeleteButton();
		UIKeyWords.takeScreenShots("JobTitleADD");
		log.info("Job Title ADD Sucessfully");
	}

	@Test(priority = 4)
	public void PayGradesOpen() throws IOException, InterruptedException {
		adminpage.AdminTabOpen();
		adminpage.Job();
		adminpage.PayGrades();
		UIKeyWords.takeScreenShots("PayGradesOpen");
		log.info("Pay Grades Open Sucessfully");
	}

	@Test(priority = 5)
	public void PayGradesAddGrade() throws IOException, InterruptedException {
		adminpage.AdminTabOpen();
		adminpage.Job();
		adminpage.PayGrades();
		adminpage.ClickOnADDButton();
		adminpage.EnterPayGrades();
		adminpage.ClickOnSaveButton();
		Thread.sleep(3000);
		adminpage.Job();
		adminpage.PayGrades();
		adminpage.PayGradesDelete();
		adminpage.ClickOnYESDeleteButton();
		UIKeyWords.takeScreenShots("PayGradesOpen");
		log.info("Pay Grades Open Sucessfully");
	}

	@Test(priority = 6)
	public void EmploymentStatusOpen() throws IOException, InterruptedException {
		adminpage.AdminTabOpen();
		adminpage.Job();
		adminpage.EmploymentStatus();
		UIKeyWords.takeScreenShots("PayGradesOpen");
		log.info("Employment Status Open Sucessfully");
	}

	@Test(priority = 7)
	public void EmploymentStatusADD() throws IOException, InterruptedException {
		adminpage.AdminTabOpen();
		adminpage.Job();
		adminpage.EmploymentStatus();
		adminpage.ClickOnADDButton();
		adminpage.EnterEmploymentStatus();
		adminpage.ClickOnSaveButton();
		adminpage.EmploymentStatusDelete();
		adminpage.ClickOnYESDeleteButton();
		UIKeyWords.takeScreenShots("EmploymentStatusADD");
		log.info("Employment Status ADD Sucessfully");
	}
	
	@Test(priority = 8)
	public void JobCategoriesOpen() throws IOException, InterruptedException {
		adminpage.AdminTabOpen();
		adminpage.Job();
		adminpage.JobCategories();
		UIKeyWords.takeScreenShots("JobCategoriesOpen");
		log.info("JobCategories Open Sucessfully");
	}

	@Test(priority = 9)
	public void JobCategoriesADD() throws IOException, InterruptedException {
		adminpage.AdminTabOpen();
		adminpage.Job();
		adminpage.JobCategories();
		adminpage.ClickOnADDButton();
		adminpage.EnterJobCategories();
		adminpage.ClickOnSaveButton();
		adminpage.JobCategoriesDelete();
		adminpage.ClickOnYESDeleteButton();
		UIKeyWords.takeScreenShots("JobCategoriesADD");
		log.info("JobCategories ADD Sucessfully");
	}
	@Test(priority = 10)
	public void WorkShiftsOpen() throws IOException, InterruptedException {
		adminpage.AdminTabOpen();
		adminpage.Job();
		adminpage.WorkShifts();
		UIKeyWords.takeScreenShots("WorkShiftsOpen");
		log.info("WorkShifts Open Sucessfully");
	}
	@Test(priority = 11)
	public void WorkShiftsADD() throws IOException, InterruptedException {
		adminpage.AdminTabOpen();
		adminpage.Job();
		adminpage.WorkShifts();
		adminpage.ClickOnADDButton();
		adminpage.EnterWorkShifts();
		adminpage.ClickOnSaveButton();
		adminpage.DeleteWorkShifts();
		adminpage.ClickOnYESDeleteButton();
		UIKeyWords.takeScreenShots("WorkShiftsADD");
		log.info("WorkShifts ADD Sucessfully");
	}
}