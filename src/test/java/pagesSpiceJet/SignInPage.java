package pagesSpiceJet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseSpiceJet.BaseSpiceJet;

public class SignInPage extends BaseSpiceJet{
	@FindBy(xpath="//div[text()='Mobile Number']")
	WebElement MobileNumberradioButton;
	
	@FindBy(xpath="//div[contains(text(),' +91')]")
	WebElement CountryCodeDropDown;
	
	@FindBy(xpath="//div[contains(text(),'+93')]")
	WebElement CountryCodeSelect;
	
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	WebElement FillMobileNumber;
	
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	WebElement fillPassword;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement logInButton;
	
	@FindBy(xpath="//div[text()='Email']")
	WebElement emailRadioButton;
	
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	WebElement fillEmail;
  
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	public void signInWithEmail(String fillEmail,String fillPassword) {
		clickOn(emailRadioButton);
		type(this.fillEmail,fillEmail);
		type(this.fillPassword,fillPassword);
		clickOn(logInButton);
		
	}
	public void signInWithMobileNumber(String FillMobileNumber,String fillPassword) {
		clickOn(MobileNumberradioButton);
		clickOn(CountryCodeDropDown);
		clickOn(CountryCodeSelect);
		type(this.FillMobileNumber,FillMobileNumber);
		type(this.fillPassword,fillPassword);
		clickOn(logInButton);
		
	}
	
	

}
