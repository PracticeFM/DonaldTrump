package StefDef;

import org.apache.log4j.Logger;

import PageAction.PCDealsPageAction;
import Util_BC.LogsDell;
import Util_BC.TestBase_BootCamp;
import Util_BC.TestUtil_BootCamp;
import cucumber.api.java.en.Then;

public class PCDealsSteffDeff extends TestBase_BootCamp{
	
	PCDealsPageAction pcDealsPageAction = new PCDealsPageAction();
	Logger BC = LogsDell.getLogsBC(LogsDell.class);

	@Then("^Click on PC deals$")
	public void click_on_PC_deals() throws Throwable {
		pcDealsPageAction.ClickonPCdeals();
		 TestUtil_BootCamp.takescreenshot(driver, "PC Deals");
		 BC.info("PC deals page open");
	}

	@Then("^Click on laptop deals link$")
	public void click_on_laptop_deals_link() throws Throwable {
		pcDealsPageAction.Clickonlaptopdealslink();
		TestUtil_BootCamp.takescreenshot(driver, "Laptop deals");
		BC.info("Click on deals");
	}

	@Then("^Verify Laptop Deals Display$")
	public void verify_Laptop_Deals_Display() throws Throwable {
		pcDealsPageAction.VerifyLaptopDealsDisplay();
		BC.info("Verified page");
	}



}
