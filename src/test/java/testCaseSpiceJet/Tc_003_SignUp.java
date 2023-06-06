package testCaseSpiceJet;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSpiceJet.BaseSpiceJet;
import pagesSpiceJet.HomePage;
import pagesSpiceJet.SignUpPage;

public class Tc_003_SignUp extends BaseSpiceJet {
	@BeforeTest
	public void setup() {
		testName = "tc_003_validateSignUpFunctionality";
		testDescription = "SignUp Functionality";
		testCategory = "Regression";
		testAuthor = "Sindhuja";
		sheetName = "SignUpPage";
	}

	@Test(dataProvider = "getFromExcel")
	public void signUp(String firstName,String lastName,String mobileNumber,
			String emailId , String newPassword, String confirmPassword) throws InterruptedException {
		HomePage hp=new HomePage();
		hp.signUpButton();
		windowsHandle();
		SignUpPage sp = new SignUpPage();
		sp.signUpFunctionality(firstName, lastName, mobileNumber,
				emailId, newPassword, confirmPassword, confirmPassword);
		
	}
}