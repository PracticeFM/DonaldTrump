package StefDef;

import org.apache.log4j.Logger;

import PageAction.LogInAction;
import Util_BC.LogsDell;
import Util_BC.TestBase_BootCamp;
import Util_BC.TestUtil_BootCamp;
import cucumber.api.java.en.Then;

public class LogInStefDeff extends TestBase_BootCamp{
	LogInAction logInAction = new LogInAction();
	Logger BC = LogsDell.getLogsBC(LogsDell.class);

	@Then("^Click on Sing In button$")
	public void click_on_Sing_In_button() throws Throwable {
		logInAction.ClickonSingInbutton();
		TestUtil_BootCamp.takescreenshot(driver, "Dell Home Page");
		BC.info("Click SignIn");
	}

	@Then("^Click on Sign In Link$")
	public void click_on_Sign_In_Link() throws Throwable {
		logInAction.ClickonSignInLink();
		BC.info("Click on SingIn Link");
	}

	@Then("^Enter User Email$")
	public void enter_User_Email() throws Throwable {
		logInAction.EnterUserEmail();
		BC.info("Enter User Email");
	}

	@Then("^Enter User Password$")
	public void enter_User_Password() throws Throwable {
		logInAction.EnterUserPassword();
		BC.info("Enter Password");
	}

	@Then("^Click on Sing In$")
	public void click_on_Sing_In() throws Throwable {
		logInAction.ClickonSingIn();
		BC.info("Click Sign In ");
	}

	@Then("^Verify User Can log in$")
	public void verify_User_Can_log_in() throws Throwable {
		logInAction.VerifyUserCanlogin();
		TestUtil_BootCamp.takescreenshot(driver, "LogIn Verified Page");
		BC.info("Verification Page display");
	}



}
