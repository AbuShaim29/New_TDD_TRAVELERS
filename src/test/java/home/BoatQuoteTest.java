package home;

import org.testng.annotations.Test;

import base.BaseClass;

public class BoatQuoteTest extends BaseClass{

	@Test
	public void boatQuoteFlow() {
		homePage.boatsteps("11230");
		addresePage.addressPageSteps("Information About You","Ahad","Ritto", "abcd@gmail", "123","456", "7890","999 e 42ND st", "Brooklyn","11230","4", "14", "1997", "1_3", "Basic");
	}
}
