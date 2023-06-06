package pagesSpiceJet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseSpiceJet.BaseSpiceJet;

public class Bookingpage extends BaseSpiceJet {
	@FindBy(xpath="(//div[text()='Continue'])[1]")
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
	
	
	@FindBy(xpath="//div[text()='Continue']")
	WebElement clickContinue;
	
	@FindBy(xpath="(//div[text()='Continue'])[3]")
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
	
	public Bookingpage() {
		PageFactory.initElements(driver, this);
	}
	
	public void fillDetailsforBooking(String firstName,String lastname, 
			String mobileNumber,String emailAddress,String country,
			String city) {
		clickOn(continueToPay);
		selectFromDropDown(clickDropDown,"Mrs");
		
		type(firstNameAndMiddleName,firstName);
		type(lastName,lastname);
		type(fillMobileNumber,mobileNumber);
		type(fillEmailAddress,emailAddress);
		selectFromDropDown(clickCountryDropDown,country);
		type(fillTownOrCity,city);
		clickOn(selectCheckBox);
		clickOn(clickContinue);
		clickOn(clickContinueInAddOns);
	}
	
	public void paymentInfo(String cardNumber, String cardHoldername, String expMonth, 
			String expiryyear, String cvvNmber){
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
