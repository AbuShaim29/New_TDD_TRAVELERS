package home;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;
import reporting.Logs;
import utils.retry.RetryClass;

public class HomeTest extends BaseClass {
	@Test(priority = 1, testName = "Testing Auto Quote with priority 1")
	public void AutoQuote1() {
		Logs.log("This is priority 1");
	}

	@Test(priority = 0, groups = { "Auto", "priority" })
	public void AutoQuote2() {
		Logs.log("This is priority 0");
	}

	@Test(enabled = false,groups = { "Auto", "nopriority" })
	public void AutoQuote3() {
		Logs.log("No priority 3");
	}

	@Test(groups = { "Auto", "priority" }, dependsOnGroups = "Auto", alwaysRun = true,retryAnalyzer = RetryClass.class)
	public void AutoQuote4() {
		Logs.log("No priority 4");
		//Assert.fail();
	}

	@Test(groups = "Auto",dependsOnGroups = "Auto",alwaysRun = true)
	public void aAutoTest() {
		Logs.log("No priority 5");
	}
	@Test(groups = "Auto",dependsOnGroups = "AutoQuote3",ignoreMissingDependencies =true )
	public void AutoQuote6() {
		Logs.log("No priority6");
	}

	@Test(priority = 100, enabled = false)
	public void bAutoTest() {
		Logs.log("This is priority 100");
	}
	
}
