package pagesSpiceJet;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath = "//div[@data-testid='round-trip-radio-button']")
    WebElement RoundTripRadioButton;

	@FindBy(xpath = "//div[text()='From']")
	WebElement from;

	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement fromInput;

	@FindBy(xpath = "//div[text()='To']")
	WebElement to;

	@FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement toInput;

	@FindBy(xpath = "//div[@data-testid='departure-date-dropdown-label-test-id']")
	WebElement departureDate;// ---------

	@FindBy(xpath = "(//div[text()='17'])[1]")
	WebElement dateSelect;// ---------

	// @FindBy(xpath =
	// "//div[@data-testid='undefined-month-June-2023']//div[text()='21']")
	// WebElement departureDateSelect;//---------

	@FindBy(xpath = "//div[@data-testid='return-date-dropdown-label-test-id']")
	WebElement returnDate;

	@FindBy(xpath = "(//div[text()='21'])[1]")
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

	@FindBy(xpath = "//div[text()='round trip']")
	WebElement roundTripRadioButton;

	@FindBy(xpath = "//div[text()='Select Date']")
	WebElement returnDatecalender;

	@FindBy(xpath = "//div[text()='check-in']")
	WebElement checkiInOption;

	@FindBy(xpath = "//input[@placeholder='john.doe@spicejet.com']")
	WebElement checkInValidate;

	@FindBy(xpath = "//div[text()='flight status']")
	WebElement flightStatusOption;

	@FindBy(xpath = "//div[text()='Please select Flight No.']")
	WebElement flightStatusValidatation;

	@FindBy(xpath = "//div[text()='manage booking']")
	WebElement manageBookingOption;

	@FindBy(xpath = "//div[text()='View / Manage Booking']")
	WebElement manageBookingValidation;

	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement continueToPay;
	
	@FindBy(xpath="//div[@data-testid='title-contact-detail-card']")
	WebElement clickDropDown;
	
	@FindBy(xpath="//div[text()='Mrs']")
	WebElement selectDropDown;
	
	@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
	WebElement firstNameAndMiddleName;
	
	@FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@data-testid='contact-number-input-box']")
	WebElement fillMobileNumber;
	
	@FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement fillEmailAddress;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
	WebElement clickCountryDropDown;
	
	@FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
	WebElement fillTownOrCity;
	
	@FindBy(xpath="//div[text()='I am flying as the primary passenger']")
	WebElement selectCheckBox;
	
	
	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
	WebElement clickContinue;
	
	@FindBy(xpath="(//div[@data-testid='add-ons-continue-footer-button'])[3]")
	WebElement clickContinueInAddOns;
	
	@FindBy(xpath="//iframe[@class='card_number_iframe']")
	WebElement iFrameCardNumber;
	
	@FindBy(xpath="//input[@class='card_number']")
	WebElement fillCardNumber;
	
	@FindBy(xpath="//iframe[@class='name_on_card_iframe']")
	WebElement iframecardHolderName;
	
	@FindBy(xpath="//input[@class='name_on_card']")
	WebElement cardHolderName;
	
	@FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
	WebElement iFramecardexpirymonth;
	
	@FindBy(xpath="//input[@class='card_exp_month']")
	WebElement cardexpirymonth;
	
	@FindBy(xpath="//iframe[@class='card_exp_year_iframe']")
	WebElement iFramecardExpiryYear;
	
	@FindBy(xpath="//input[@class='card_exp_year']")
	WebElement cardExpiryYear;
	
	@FindBy(xpath="//iframe[@class='security_code_iframe']")
	WebElement iFramecvvNumber;
	
	@FindBy(xpath="//input[@class='security_code']")
	WebElement cvvNumber;
	
	@FindBy(xpath="//div[@data-testid='paymentTnC']")
	WebElement checkBoxTermsAndConditions;
	
	@FindBy(xpath="//div[@data-testid='common-proceed-to-pay']")
	WebElement proceedToPayButton;
	
	@FindBy(xpath="//a[@class='resend-btn']")
	WebElement resendOTPlink;
	
	@FindBy(xpath="//input[@id='otpValue']")
	WebElement fillOTP;
	
	@FindBy(xpath="//a[@class='btn btn__submit']")
	WebElement submitOTP;
	
	@FindBy(xpath="//a[@class='btn btn__cancel']")
	WebElement cancelOTP;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void flightToBooking(String typefrom, String typeto) {
		clickOn(oneWayTripRadioButton);
		clickOn(from);
		type(this.fromInput, typefrom);
		clickOn(to);
		type(this.toInput, typeto);
		waitExplicit(departureDate);
		jsClickOn(departureDate);
		waitExplicit(dateSelect);
		clickOn(dateSelect);
		// driver.findElement(By.xpath("//div[@data-testid='undefined-month-"+month+"-2023']//div[text()='"+date+"']")).click();

//		clickOn(passengersDropDown);
//		clickOn(selectAdult);
//		selectFromDropDown(currencyDropDown, "AED");
		actionsClick(searchFlightButton);

	}

	public boolean checkInValidatation() {
		clickOn(checkiInOption);
		boolean act = checkInValidate.isDisplayed();
		return act;
	}

	public String flightStatus() {
		clickOn(flightStatusOption);
		String actual = flightStatusValidatation.getText();
		return actual;
	}

	public String managebooking() {
		clickOn(manageBookingOption);
		String actual = manageBookingValidation.getText();
		return actual;
	}

	public void loginButton() {
		clickOn(loginButton);
	}

	public void signUpButton() {
		clickOn(signUpLink);
	}

	public void oneWaytrip(String typefrom, String typeto) {
		clickOn(oneWayTripRadioButton);
		clickOn(from);
		type(this.fromInput, typefrom);
		clickOn(to);
		type(this.toInput, typeto);
		waitExplicit(departureDate);
		jsClickOn(departureDate);
		waitExplicit(dateSelect);
		clickOn(dateSelect);
		
		actionsClick(searchFlightButton);

	}

	

	public void roundTrip(String typefrom, String typeto) {
		clickOn(RoundTripRadioButton);
		clickOn(from);
		type(this.fromInput, typefrom);
		clickOn(to);
		type(this.toInput, typeto);
		waitExplicit(departureDate);
		jsClickOn(departureDate);
		waitExplicit(dateSelect);
		clickOn(dateSelect);
		
		actionsClick(searchFlightButton);
	}
	public void fillDetailsforBooking(String typefrom, String typeto,String firstName,String lastname, 
			String mobileNumber,String emailAddress,String city) {
		
		clickOn(oneWayTripRadioButton);
		clickOn(from);
		type(this.fromInput, typefrom);
		clickOn(to);
		type(this.toInput, typeto);
		waitExplicit(departureDate);
		jsClickOn(departureDate);
		waitExplicit(dateSelect);
		clickOn(dateSelect);
		
		actionsClick(searchFlightButton);
		actionsClick(continueToPay);
		//selectFromDropDown(clickDropDown,"Mrs");
		//clickOn(selectDropDown);
		type(firstNameAndMiddleName,firstName);
		type(lastName,lastname);
		type(fillMobileNumber,mobileNumber);
		type(fillEmailAddress,emailAddress);
		//selectFromDropDown(clickCountryDropDown,country);
		type(fillTownOrCity,city);
		actionsClick(selectCheckBox);
		actionsClick(clickContinue);
		jsClickOn(clickContinueInAddOns);
	}
	public void paymentInfo(String typefrom, String typeto,String firstName,String lastname, 
			String mobileNumber,String emailAddress,String city,String cardNumber, String cardHoldername, String expMonth, 
			String expiryyear, String cvvNmber){
		clickOn(oneWayTripRadioButton);
		clickOn(from);
		type(this.fromInput, typefrom);
		clickOn(to);
		type(this.toInput, typeto);
		waitExplicit(departureDate);
		jsClickOn(departureDate);
		waitExplicit(dateSelect);
		clickOn(dateSelect);
		
		actionsClick(searchFlightButton);
		actionsClick(continueToPay);
		//selectFromDropDown(clickDropDown,"Mrs");
		//clickOn(selectDropDown);
		type(firstNameAndMiddleName,firstName);
		type(lastName,lastname);
		type(fillMobileNumber,mobileNumber);
		type(fillEmailAddress,emailAddress);
		//selectFromDropDown(clickCountryDropDown,country);
		type(fillTownOrCity,city);
		actionsClick(selectCheckBox);
		actionsClick(clickContinue);
		jsClickOn(clickContinueInAddOns);
		waitExplicit(iFrameCardNumber);
		driver.switchTo().frame(iFrameCardNumber);
		type(fillCardNumber,cardNumber);
		switchingTodefault();
		driver.switchTo().frame(iframecardHolderName);
		type(cardHolderName,cardHoldername);
		switchingTodefault();
		driver.switchTo().frame(iFramecardexpirymonth);
		type(cardexpirymonth,expMonth);
		switchingTodefault();
		driver.switchTo().frame(iFramecardExpiryYear);
		type(cardExpiryYear,expiryyear);
		switchingTodefault();
		driver.switchTo().frame(iFramecvvNumber);
		type(cvvNumber,cvvNmber);
		switchingTodefault();
		clickOn(checkBoxTermsAndConditions);
		clickOn(proceedToPayButton);
		}

}
