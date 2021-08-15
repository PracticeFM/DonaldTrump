package PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Util_BC.TestBase_BootCamp;

public class LogInLocator extends TestBase_BootCamp{

public LogInLocator() {  
		
		PageFactory.initElements(driver, this);
	}
		@FindBy(how=How.XPATH, using="//span[@class='mh-si-label']")
		public WebElement SingInButton;

		@FindBy(how=How.LINK_TEXT, using="Sign In")
		public WebElement SingInLink;

		@FindBy(how=How.XPATH, using="//input[@id='EmailAddress']")
		public WebElement Email;

		@FindBy(how=How.XPATH, using="//input[@id='Password']")
		public WebElement Pasword;

		@FindBy(how=How.XPATH, using=" //button[@id='sign-in-button']")
		public WebElement LogIn;
		
		@FindBy(how=How.XPATH, using="//span[contains(text(),'MOHAMMAD JAHAN')]")
		public WebElement VerifyLogIn;
		
}
