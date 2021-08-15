package PageAction;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import PageLocator.LogInLocator;
import Util_BC.TestBase_BootCamp;

public class LogInAction extends TestBase_BootCamp{
	
	LogInLocator logInLocator = new LogInLocator();
	
	public void ClickonSingInbutton() {
		logInLocator.SingInButton.click();
	}
	public void ClickonSignInLink() {
		logInLocator.SingInLink.click();
	}
	public void EnterUserEmail () {
		logInLocator.Email.sendKeys("mohammad.jahan@nexttechitc.com");
	}
	public void EnterUserPassword() {
		logInLocator.Pasword.sendKeys("Jahan1234");
	}
	public void ClickonSingIn() {
		logInLocator.LogIn.click();
	}
	public void VerifyUserCanlogin () {
		boolean True = logInLocator.VerifyLogIn.isDisplayed();
		Assert.assertTrue(True);
	}
}
