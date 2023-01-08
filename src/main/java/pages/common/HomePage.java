package pages.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonWaits;
import utils.data.AutoData;

import static common.CommonActions.*;

public class HomePage {

	WebDriver driver;
	CommonWaits waits;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "zipCode")
	WebElement zipElement;

	@FindBy(id = "trans-fake-get-quote")
	WebElement productElement;

	@FindBy(id = "lbl-0-2")
	WebElement homeElement;
	
	@FindBy(id = "lbl-0-7")
	WebElement boatElement;

	@FindBy(id = "body-btn-get-quote")
	WebElement startMyQuoteElement;

	@FindBy(xpath = "//label[@id='currentTrvCustomerNo']")
	WebElement noElement;

	@FindBy(xpath = "//button[@id='continue']")
	WebElement continueQuote;
	// By autoElementBy = By.xpath("//label[@id='lbl-0-1']");
	// driver.findElement(autoElementBy) ==
	// driver.findElement(by.xpath("(//label[@id='lbl-0-1']"))

	public void autoSteps(String zip) {
	input(zipElement, zip); 
	click(productElement);
	click(homeElement);
	click(startMyQuoteElement);
	click(noElement);
//	waits.waitUntilVisible(continueQuote);
//	if (isPresent(continueQuote)) {
//		if (isDisplayed(continueQuote)) {
//			click(continueQuote);
//		}
//		}	
	try {
		
	} catch (Exception e) {
		((JavascriptExecutor) driver).executeScript("document.getElementById('continueQuote').click();");
	}
		//click(continueQuote);
	}
	
	public void boatsteps(String zip) {
		input(zipElement, zip);
		click(productElement);
		click(boatElement);
		waits.waitUntilClickable(startMyQuoteElement);
		click(startMyQuoteElement);
	}
	
	public void autoSteps(AutoData autoData) {
		input(zipElement, autoData.getZip()); 
		click(productElement);
		click(homeElement);
		click(startMyQuoteElement);
		click(noElement);
			
	}
}
