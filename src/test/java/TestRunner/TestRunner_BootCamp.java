package TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Util_BC.TestBase_BootCamp;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Feature"} , 
plugin = {"json:target/cucumber.json"},
glue = {"StefDef"},


tags= {"@Bcamp"})
public class TestRunner_BootCamp extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	public void LAppURL () {
		TestBase_BootCamp LaunchD = new TestBase_BootCamp();
		LaunchD.i();
	}
	
	@AfterTest
	public void CAppURL() {
		TestBase_BootCamp LaunchD = new TestBase_BootCamp();
		LaunchD.driver.quit();
	}

	

}
