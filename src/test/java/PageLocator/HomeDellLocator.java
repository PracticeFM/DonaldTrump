package PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Util_BC.TestBase_BootCamp;

public class HomeDellLocator extends TestBase_BootCamp{
	
public HomeDellLocator() {  
		
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(how=How.ID, using="l5")
		public WebElement Dealsx;
		
		@FindBy(how=How.LINK_TEXT, using="//span[text()=' Laptop Deals']")
		public WebElement LaptopDeals;
		
		@FindBy(how=How.LINK_TEXT, using="//span[text()='View all Laptop Deals for Home']")
		public WebElement LaptopForHome;
		
		@FindBy(how=How.LINK_TEXT, using="//h1[text()='Laptop Deals']")
		public WebElement VerifyDealPage;
		
		

}
