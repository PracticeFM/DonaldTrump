package PageAction;

import org.testng.Assert;

import PageLocator.PCDealsPageLocator;
import Util_BC.TestBase_BootCamp;

public class PCDealsPageAction extends TestBase_BootCamp{
	PCDealsPageLocator pcDealsPageLocator = new PCDealsPageLocator();
	
	public void ClickonPCdeals() {
		pcDealsPageLocator.pcdeals.click();
	}
	public void Clickonlaptopdealslink() {
		pcDealsPageLocator.LaptopDealsLink.click();
	}
	public void VerifyLaptopDealsDisplay() {
		boolean VerifyPage = pcDealsPageLocator.LaptopDealsDisplayLink.isDisplayed();
		Assert.assertTrue(VerifyPage);
	}
	
}
