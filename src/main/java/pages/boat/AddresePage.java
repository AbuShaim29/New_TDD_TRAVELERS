package pages.boat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonWaits;
import static common.CommonActions.*;

public class AddresePage {
	CommonWaits waits;

	public AddresePage(WebDriver driver) {
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ctl00_lblHeader")
	WebElement addressPageTitle;
	@FindBy(xpath = "//input[@id='ctl00_mainContent_ucConsumer_firstname']")
	WebElement firstNameElement;
	@FindBy(id = "ctl00_mainContent_ucConsumer_lastname")
	WebElement lastNameElement;
	@FindBy(id = "ctl00_mainContent_ucConsumer_email")
	WebElement emailElement;
	@FindBy(id = "ctl00_mainContent_ucConsumer_homephone1")
	WebElement phoneElement1;
	@FindBy(id = "ctl00_mainContent_ucConsumer_homephone2")
	WebElement phoneElement2;
	@FindBy(id = "ctl00_mainContent_ucConsumer_homephone3")
	WebElement phoneElement3;
	@FindBy(id = "ctl00_mainContent_ucConsumer_street")
	WebElement addressElement;
	@FindBy(id = "ctl00_mainContent_ucConsumer_city")
	WebElement cityElement;
	@FindBy(id = "ctl00_mainContent_ucConsumer_zipcode")
	WebElement zipcodElement;
	@FindBy(xpath = "//select[@id='ctl00_mainContent_ucConsumer_cboDOB']")
	WebElement dobMonthElement;
	@FindBy(id = "ctl00_mainContent_ucConsumer_txtDOBDay")
	WebElement dobDayElement;
	@FindBy(id = "ctl00_mainContent_ucConsumer_txtDOBYear")
	WebElement dobYearElement;
	@FindBy(id = "ctl00_mainContent_ddYearsExperience")
	WebElement experiencElement;
	@FindBy(id = "ctl00_mainContent_ddEdeucationLevel")
	WebElement educationElement;
	@FindBy(id = "ctl00_mainContent_btnContinue")
	WebElement continueElement;

	public void addressPageSteps(String expected, String firstName, String lastName, String email, String phone1,
			String phone2, String phone3, String address, String city, String zipcode, String dobMonth, String dobDay,
			String dobYear, String experience, String education) {
		waits.waitUntilVisible(addressPageTitle);
		assertGetText(addressPageTitle, expected);
		input(firstNameElement, firstName);
		input(lastNameElement, lastName);
		input(emailElement, email);
		input(phoneElement1, phone1);
		input(phoneElement2, phone2);
		input(phoneElement3, phone3);
		input(addressElement, address);
		input(cityElement, city);
		input(zipcodElement, zipcode);
		if (isPresent(dobMonthElement) && isDisplayed(dobMonthElement)) {
			selectDropdown(dobMonthElement, dobMonth);
		}
		input(dobDayElement, dobDay);
		input(dobYearElement, dobYear);

		if (isPresent(experiencElement) && isDisplayed(experiencElement)) {
			selectDropdown(experiencElement, experience);
		}
		if (isPresent(educationElement) && isDisplayed(educationElement)) {
			selectDropdown(educationElement, education);
		}
		click(continueElement);
	}
}
