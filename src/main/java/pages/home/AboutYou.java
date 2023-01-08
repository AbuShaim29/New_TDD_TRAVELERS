package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.data.AutoData;

import static common.CommonActions.*;

public class AboutYou {

	public AboutYou(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstNameElement;
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastNamElement;
	
	@FindBy(xpath = "//input[@id='streetAddr1']")
	WebElement addressElement;
	
	@FindBy(xpath  = "//div[@class='col-8 col-sm-5 col-md-5 float-left']")
	WebElement genderElement;
	
	@FindBy(xpath = "//input[@id='dobMonth']")
	WebElement dobMonthElement;
	
	@FindBy(xpath = "//input[@id='dobDay']")
	WebElement dobDayElement;
	
	@FindBy(xpath = "//input[@id='dobYear']")
	WebElement dobYearElement;
	
	@FindBy(xpath = "//button[@id='continue']")
	WebElement continueElement;
	
	public void aboutYouStep(String firstName ,String lastName,String address,String dobMonth,String dobDay,String dobYear) {
		input(firstNameElement,firstName);
		input(lastNamElement,lastName);
		input(addressElement, address);
	    click(genderElement);
	    input(dobMonthElement, dobMonth);
	    input(dobDayElement, dobDay);
	    input(dobYearElement, dobYear);
	    click(continueElement);
	}
	public void aboutYouStep(AutoData autoData) {
		input(firstNameElement,autoData.getFirstName());
		input(lastNamElement,autoData.getLastName());
		input(addressElement, autoData.getAddress());
	    click(genderElement);
	    input(dobMonthElement, autoData.getDobMonth());
	    input(dobDayElement, autoData.getDobDay());
	    input(dobYearElement, autoData.getDobYear());
	    click(continueElement);
}
}
