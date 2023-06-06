package testCaseSpiceJet;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import baseSpiceJet.BaseSpiceJet;
import pagesSpiceJet.HomePage;

public class Tc_009_BookingPageValidatations extends BaseSpiceJet {
	@BeforeTest
	public void setup() {
		testName = "tc_009_BookingPageValidation";
		testDescription = "Check text is present or not";
		testCategory = "Regression";
		testAuthor = "Sindhuja";
	}

	@Test
	public void checkInvalidation() throws Exception {
		HomePage hp = new HomePage();
        boolean actual =(boolean) hp.checkInValidatation();
        Assert.assertTrue(actual);
    }
	@Test
	public void flightStatusValidation() throws Exception {
		HomePage hp = new HomePage();
		String acttext = hp.flightStatus();
		String exptext="Please select Flight No.";
		softAssert(acttext, exptext);
		if (acttext.equals(exptext)) {
			reportStep("Validating the text in booking page - Pass", "Pass", testName);
		} else {
			reportStep("Validating the text in booking page - Fail", "Fail", testName);
		}
    }
	@Test
	public void manageBookingValidation() throws Exception {
		HomePage hp = new HomePage();
		String acttext = hp.managebooking();
		String exptext="View / Manage Booking";
		softAssert(acttext, exptext);
		if (acttext.equals(exptext)) {
			reportStep("Validating the text in booking page - Pass", "Pass", testName);
		} else {
			reportStep("Validating the text in booking page - Fail", "Fail", testName);
		}
		
    }
}
