package POMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v101.browser.Browser;

import KeyWords_BrowserOpen_Logout.UIKeyWords;
import Util.PropUtil;

public class LoginPage {
	PropUtil pro = new PropUtil();
	
	public void EnterValidUserNameAndPassword() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("userNameTxtBox")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("userNameTxtBox")), pro.getUserAndPassword("ValidUsername"));
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("passwordTxtBox")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("passwordTxtBox")),pro.getUserAndPassword("Validpassword"));	
	}
	public void EnterInvalidUserNameAndPassword() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("userNameTxtBox")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("userNameTxtBox")), pro.getUserAndPassword("InvalidUserName"));
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("passwordTxtBox")));
		UIKeyWords.SendKeys(By.xpath(pro.getObjectFromRepo("passwordTxtBox")),pro.getUserAndPassword("InvalidPassword"));
	}
	public void ClickOnLoginButton() {
		UIKeyWords.ExplicitlyWait(By.xpath(pro.getObjectFromRepo("LoginBtn")));
		UIKeyWords.ClickMe(By.xpath(pro.getObjectFromRepo("LoginBtn")));
	}
}