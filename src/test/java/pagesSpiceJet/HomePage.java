package pagesSpiceJet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseSpiceJet.BaseSpiceJet;

public class HomePage extends BaseSpiceJet {
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement loginButton;

	@FindBy(xpath = "//div[contains(text(),'Signup')]")
	WebElement signUpLink;
//--------------------------------------------------------------
	@FindBy(xpath = "//div[text()='one way']")
	
	WebElement oneWayTripRadioButton;

	@FindBy(xpath = "//div[text()='From']")
	WebElement from;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement fromInput;

	@FindBy(xpath = "//div[text()='To']")
	WebElement to;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement toInput;
	
	@FindBy(xpath = "//div[@data-testid='departure-date-dropdown-label-test-id']")
	WebElement departureDate;//---------

	@FindBy(xpath = "//div[@data-testid='undefined-month-June-2023']//div[text()='21']")
	WebElement departureDateSelect;//---------
	
	@FindBy(xpath = "//div[@data-testid='return-date-dropdown-label-test-id']")
	WebElement returnDate;
	
	@FindBy(xpath = "//div[@data-testid='undefined-month-June-2023']//div[text()='25']")
	WebElement resturnDateSelect;

	@FindBy(xpath = "//div[text()='Passengers']")
	WebElement passengersDropDown;
	
	@FindBy(xpath = "//div[text()='Children']")
	WebElement selectAdult;

	@FindBy(xpath = "//div[text()='Currency']")
	WebElement currencyDropDown;

	@FindBy(xpath = "//div[text()='Family & Friends']")
	WebElement familyFriendsRadioButton;

	@FindBy(xpath = "//div[text()='Senior Citizen']")
	WebElement SeniorCitizenRadioButton;

	@FindBy(xpath = "//div[text()='Unaccompanied Minor']")
	WebElement unaccompaniedMinorRadioButton;

	@FindBy(xpath = "//div[text()='Students']")
	WebElement studentsRadioButton;

	@FindBy(xpath = "//div[text()='Armed Forces']")
	WebElement armedForcesRadioButton;

	@FindBy(xpath = "(//div[text()='Govt. Employee'])[2]")
	WebElement govtEmployeeRadioButton;

	@FindBy(xpath = "(//div[text()='Special Assistance'])[1]")
	WebElement specialAssistance;

	@FindBy(xpath = "//div[text()='Search Flight']")
	WebElement searchFlightButton;
	
	@FindBy(xpath="//div[text()='round trip']")
	WebElement roundTripRadioButton;
	
	@FindBy(xpath="//div[text()='Select Date']")
	WebElement returnDatecalender;
	
	@FindBy(xpath="//div[text()='check-in']")
	WebElement checkiInOption;
	
	@FindBy(xpath="//input[@placeholder='john.doe@spicejet.com']")
	WebElement checkInValidate;
	
	@FindBy(xpath="//div[text()='flight status']")
	WebElement flightStatusOption;
	
	@FindBy(xpath="//div[text()='Please select Flight No.']")
	WebElement flightStatusValidatation;
	
	@FindBy(xpath="//div[text()='manage booking']")
	WebElement manageBookingOption;
	
	@FindBy(xpath="//div[text()='View / Manage Booking']")
	WebElement manageBookingValidation;

	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void flightToBooking(String typefrom, String typeto) {
		clickOn(oneWayTripRadioButton);
		clickOn(from);
		type(this.fromInput,typefrom);
		clickOn(to);
		type(this.toInput,typeto);
		waitExplicit(departureDate);
		clickOn(departureDate);
		clickOn(departureDateSelect);
		clickOn(passengersDropDown);
		clickOn(selectAdult);
		selectFromDropDown(currencyDropDown, "AED");
		clickOn(searchFlightButton);
		
	}
	public boolean  checkInValidatation( ) {
		clickOn(checkiInOption);
		boolean act=checkInValidate.isDisplayed();
		return act;
   }
	
	public String flightStatus() {
		clickOn(flightStatusOption);
		String actual =flightStatusValidatation.getText();
		return actual;
	}
	public String managebooking() {
		clickOn(manageBookingOption);
		String actual =manageBookingValidation.getText();
		return actual;
	}
	public void loginButton() {
		clickOn(loginButton);
	}

	public  void signUpButton() {
		clickOn(signUpLink);
	}

	public void oneWaytripwithFamilyFriends(String typefrom, String typeto) {
		clickOn(oneWayTripRadioButton);
		clickOn(from);
		type(this.fromInput,typefrom);
		clickOn(to);
		type(this.toInput,typeto);
		clickOn(departureDate);
		clickOn(departureDateSelect);
        selectFromDropDown(passengersDropDown, "Adult");
		selectFromDropDown(currencyDropDown, "AED");
		clickOn(familyFriendsRadioButton);
		clickOn(searchFlightButton);
	}

	public void oneWaytripwithGovtEmployee(String from, String to) {
		clickOn(oneWayTripRadioButton);
		type(this.from, from);
		type(this.to, to);
		clickOn(departureDate);
		selectFromDropDown(passengersDropDown, "Adult");
		selectFromDropDown(currencyDropDown, "AED");
		clickOn(govtEmployeeRadioButton);
		clickOn(searchFlightButton);
	}
	public void roundTripwithGovtEmployee(String from, String to) {
		clickOn(oneWayTripRadioButton);
		type(this.from, from);
		type(this.to, to);
		clickOn(departureDate);
		clickOn(departureDateSelect);
		selectFromDropDown(passengersDropDown, "Adult");
		selectFromDropDown(currencyDropDown, "AED");
		clickOn(govtEmployeeRadioButton);
		clickOn(searchFlightButton);
	}

}
