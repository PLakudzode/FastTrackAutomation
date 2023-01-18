package KeyWords_BrowserOpen_Logout;

import org.apache.poi.ss.usermodel.helpers.BaseRowColShifter;
import org.bouncycastle.operator.KeyWrapper;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Util.PropUtil;

public class LogIn_LogOut {
	PropUtil pro = new PropUtil();

	@BeforeMethod
	public void BrowserOpenAndLogInWebApplication() {
		BrowserUtil.browserOpen(pro.getObjectFromRepo("browserName"));
		BrowserUtil.WebApplicationURL(pro.getObjectFromRepo("OrangeHRM"));
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("userNameTxtBox")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("userNameTxtBox")), pro.getUserAndPassword("ValidUsername"));
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("passwordTxtBox")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("passwordTxtBox")), pro.getUserAndPassword("Validpassword"));
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("LoginBtn")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("LoginBtn")));
	}
	@AfterMethod
	public void BrowserCloseAndLogOutWebApplication() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("LogOuTab")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("LogOuTab")));
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("ClickOnLogOut")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("ClickOnLogOut")));
		BrowserUtil.browserClose();
	}
}