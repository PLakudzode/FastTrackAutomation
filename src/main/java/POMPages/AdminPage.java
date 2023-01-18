package POMPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import KeyWords_BrowserOpen_Logout.BrowserUtil;
import KeyWords_BrowserOpen_Logout.LogIn_LogOut;
import KeyWords_BrowserOpen_Logout.UIKeyWords;
import Util.PropUtil;

public class AdminPage extends BrowserUtil{
	PropUtil pro=new PropUtil();
	
	public void AdminTabOpen() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("AdminTab")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("AdminTab")));
	}
	public void AdminTab_EnterUsername() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("UserManagementUsername")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("UserManagementUsername")),pro.getObjectFromRepo("EnterSystemUsername"));
	}
	public void UserRoleDropDown() {			
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("UserRoleDropDown")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("UserRoleDropDown")));
	}
	public void UserClickOnRole() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("ClickOnUserRole")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("ClickOnUserRole")));
	}
	public void ClickOnStatusDropDown() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("StatusDropDown")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("StatusDropDown")));
	}
	public void ClickOnstatus() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("ClickonStatus")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("ClickonStatus")));
	}
	public void ClickOnSearchButton() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("ClickOnSearchButton")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("ClickOnSearchButton")));	
	}
	public void Job() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("Job")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("Job")));
	}
	public void JobTitle() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("JobTitle")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("JobTitle")));
	}
	public void ClickOnADDButton() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("ADD")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("ADD")));
	}
	public void EnterJobTitle() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("EnterText")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("EnterText")), pro.getObjectFromRepo("EnterJobTitle1"));
	}
	public void EnterJobDescription() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("EnterJobDescription")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("EnterJobDescription")), pro.getObjectFromRepo("EnterJobDescription1"));
	}
	public void EnterNote() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("EnterNote")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("EnterNote")), pro.getObjectFromRepo("EnterNote1"));
	}
	public void ClickOnSaveButton() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("Save")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("Save")));
	}
	public void ClickOnDeleteButton() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("ClickOnDeletebutton")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("ClickOnDeletebutton")));
	}
	public void ClickOnYESDeleteButton() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("ClickOnYesDeleteButton")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("ClickOnYesDeleteButton")));
	}
	public void PayGrades() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("PayGrades")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("PayGrades")));
	}
	public void EnterPayGrades() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("EnterText")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("EnterText")), pro.getObjectFromRepo("EnterADDGrade"));
	}
	public void PayGradesDelete() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("DeletePayGrades")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("DeletePayGrades")));		
	}
	public void EmploymentStatus() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("EmploymentStatus")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("EmploymentStatus")));
	}
	public void EnterEmploymentStatus() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("EnterText")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("EnterText")), pro.getObjectFromRepo("EnterEmplymentStatus"));
	}
	public void EmploymentStatusDelete() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("DeleteEmpStatus")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("DeleteEmpStatus")));		
	}	
	public void JobCategories() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("JobCategories")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("JobCategories")));		
	}
	public void EnterJobCategories() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("EnterText")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("EnterText")), pro.getObjectFromRepo("EnterJobCategories"));
	}
	public void JobCategoriesDelete() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("DeleteJobCategories")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("DeleteJobCategories")));		
	}
	public void WorkShifts() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("WorkShifts")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("WorkShifts")));		
	}
	public void EnterWorkShifts() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("EnterText")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("EnterText")), pro.getObjectFromRepo("EnterShift"));
	}
	public void DeleteWorkShifts() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("DeleteWorkShifts")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("DeleteWorkShifts")));		
	}
	
}