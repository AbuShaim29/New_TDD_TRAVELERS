package auto;

import org.testng.annotations.Test;
import base.BaseClass;
import utils.data.AutoData;

public class AutoTest_w_AutoData extends BaseClass{

	AutoData autoData = new AutoData("11230", "Abu", "Shaim", "1212 newKirk Ave", "11", "29", "1997");
	
	@Test(priority = 1)
	public void homeQuoteWithAutoData() {
		homePage.autoSteps(autoData.getZip());
		aboutYou.aboutYouStep(autoData.getFirstName(),autoData.getLastName(), autoData.getAddress(), autoData.getDobMonth(), autoData.getDobDay(), autoData.getDobYear());
	}
	@Test(priority = 2)
	public void homeQuoteWithAutoDataNoParam() {
		homePage.autoSteps(autoData);
		aboutYou.aboutYouStep(autoData);
	}
}
