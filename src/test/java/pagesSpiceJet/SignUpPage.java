package pagesSpiceJet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseSpiceJet.BaseSpiceJet;

public class SignUpPage extends BaseSpiceJet{
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement tittleDropDown;
	
	@FindBy(xpath="//option[text()='Mrs']")
	WebElement selectIntittleDropDown;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement countryDropDown;
	
	@FindBy(xpath="//input[@id='dobDate']")
	WebElement dateOfBirthClick;
	
	@FindBy(xpath="//div[text()='October 1994']")
	WebElement monthYear;
	
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement mobileNumber;
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@id='new-password']")
	WebElement newPassword;
	
	@FindBy(xpath="//input[@id='c-password']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//input[@id='defaultCheck1']")
	WebElement checkBox;
	
	@FindBy(xpath="//button[@class='btn btn-red']")
	WebElement submitButton ;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	public String signUpFunctionality(String firstName,String lastName,String mobileNumber,
			String emailId , String newPassword, String confirmPassword,String textXpath) {
		
		clickOn(tittleDropDown);
		clickOn(selectIntittleDropDown);
		type(this.firstName,firstName);
		type(this.lastName,lastName);
		selectFromDropDown(countryDropDown,"India ");
		clickOn(this.dateOfBirthClick);
		type(this.mobileNumber,mobileNumber);
		type(this.emailId,emailId);
		type(this.newPassword,newPassword);
		type(this.confirmPassword,confirmPassword);
		clickOn(checkBox);
		clickOn(submitButton);
		String actMsg=driver.findElement(By.xpath(""+textXpath+"")).getText();
		return actMsg;
	}
	
	
}
