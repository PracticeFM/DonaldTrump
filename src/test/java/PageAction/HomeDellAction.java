package PageAction;

import org.testng.Assert;

import PageLocator.HomeDellLocator;
import Util_BC.TestBase_BootCamp;

public class HomeDellAction extends TestBase_BootCamp{
	
	HomeDellLocator homeDellLocator = new HomeDellLocator();
	
	
	public void Mouseoverondealslink() {
		homeDellLocator.Dealsx.click();
	}
	public void Clickonlaptopdeals() {
		homeDellLocator.LaptopDeals.click();
	}
	public void Clickonlaptopdealsforhome() {
		homeDellLocator.LaptopForHome.click();
	}
	public void Verifylaptopdealstext() { 
		boolean searchResuttt =	homeDellLocator.VerifyDealPage.isDisplayed();
		Assert.assertTrue(searchResuttt);
	}
}
