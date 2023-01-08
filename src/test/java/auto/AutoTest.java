package auto;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;

public class AutoTest extends BaseClass{

	@Test
	public void homeQuote() {
		homePage.autoSteps("11230");
		aboutYou.aboutYouStep("Abu","Shaim", "1212 newKirk Ave", "11", "29", "1997");
	} 
	
	@Parameters({"zip","firstName","lastName","address","dobMonth","dobDay","dobyear"})
	@Test
	public void homeQuoteParameter(String zip, String firstName,String lastName,String address,String dobMonth,String dobDay,String dobYear) {
		homePage.autoSteps(zip);
		aboutYou.aboutYouStep(firstName,lastName, lastName , dobMonth,dobDay, dobYear);
	}
	
}
