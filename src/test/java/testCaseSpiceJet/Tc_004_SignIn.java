package testCaseSpiceJet;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSpiceJet.BaseSpiceJet;
import pagesSpiceJet.HomePage;
import pagesSpiceJet.SignInPage;

public class Tc_004_SignIn extends BaseSpiceJet {
	@BeforeTest
	public void setup() {
		testName = "TC_004_SignIn";
		testDescription = "SignIn Functionality";
		testCategory = "Regression";
		testAuthor = "Sindhuja";
		sheetName="signInwithNumber";
	}
	@Test(dataProvider="getFromExcel")
	public void signInwithMobile(String number,String password) {
		HomePage hp=new HomePage();
		hp.loginButton();
		
		 SignInPage sp = new SignInPage(); 
		 sp.signInWithMobileNumber(number,password);
		 
		
	}
	
		
}
