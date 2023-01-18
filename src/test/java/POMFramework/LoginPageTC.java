package POMFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import KeyWords_BrowserOpen_Logout.BrowserUtil;
import KeyWords_BrowserOpen_Logout.UIKeyWords;
import POMPages.LoginPage;
import Util.PropUtil;

public class LoginPageTC {
	PropUtil pro=new PropUtil();
	LoginPage lp=new LoginPage();
	
	@Test(priority = 0)
	public void LoginWithValidCred() throws IOException, InterruptedException {
		
		BrowserUtil.browserOpen(pro.getObjectFromRepo("browserName"));
		BrowserUtil.WebApplicationURL(pro.getObjectFromRepo("OrangeHRM"));
		lp.EnterValidUserNameAndPassword();
		lp.ClickOnLoginButton();
		UIKeyWords.takeScreenShots("LoginWithValidCred");
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("LogOuTab")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("LogOuTab")));	
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("ClickOnLogOut")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("ClickOnLogOut")));
		UIKeyWords.browserClose();
	}
	@Test(priority = 1)
	public void LoginWithINValidCred() throws IOException, InterruptedException {
		BrowserUtil.browserOpen(pro.getObjectFromRepo("browserName"));
		BrowserUtil.WebApplicationURL(pro.getObjectFromRepo("OrangeHRM"));
		lp.EnterInvalidUserNameAndPassword();
		lp.ClickOnLoginButton();
		UIKeyWords.takeScreenShots("LoginWithINValidCred");
		UIKeyWords.browserClose();
	}	
}