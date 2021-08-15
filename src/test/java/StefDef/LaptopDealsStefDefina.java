package StefDef;

import PageAction.HomeDellAction;
import Util_BC.TestBase_BootCamp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LaptopDealsStefDefina extends TestBase_BootCamp{
	
	HomeDellAction homeDellAction = new HomeDellAction();

	@Given("^Open Application \"([^\"]*)\"$")
	public void open_Application(String URL) throws Throwable {
		LaunchDell(URL);
	}

	@Then("^Mouse over on deals link$")
	public void mouse_over_on_deals_link() throws Throwable {
		homeDellAction.Mouseoverondealslink();
	}

	@Then("^Click on laptop deals$")
	public void click_on_laptop_deals() throws Throwable {
		homeDellAction.Clickonlaptopdeals();
	}

	@Then("^Click on laptop deals for home$")
	public void click_on_laptop_deals_for_home() throws Throwable {
		homeDellAction.Clickonlaptopdealsforhome();
	}

	@Then("^Verify laptop deals text$")
	public void verify_laptop_deals_text() throws Throwable {
		homeDellAction.Verifylaptopdealstext();
	}


}
