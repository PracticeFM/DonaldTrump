package PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Util_BC.TestBase_BootCamp;

public class PCDealsPageLocator extends TestBase_BootCamp{

public PCDealsPageLocator() {  
		
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(how=How.LINK_TEXT, using="PC Deals")
		public WebElement pcdeals;

		
		@FindBy(how=How.XPATH, using="//body/main[1]/section[3]/div[1]/nav[1]/div[3]/a[1]")
		public WebElement LaptopDealsLink;

		@FindBy(how=How.XPATH, using="//h1[contains(text(),'Laptop Deals')]")
		public WebElement LaptopDealsDisplayLink;
		
	
}
