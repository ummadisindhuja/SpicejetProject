package testCaseSpiceJet;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSpiceJet.BaseSpiceJet;
import pagesSpiceJet.HomePage;

public class Tc_008_BookingSuccesful extends BaseSpiceJet{
	@BeforeTest
	public void setup() {
		testName = "tc_008_Booking Succesful";
		testDescription = "Check for booking confirmation message";
		testCategory = "Regression";
		testAuthor = "Sindhuja";
		}
	@Test
	public void dummyPassengerAndPaymentInfo() {
HomePage hp = new HomePage();
		
		hp.paymentInfo("Hyderabad", "Delhi","ummadi", "kumar", "8522098804", "ummadimails.ummadisindhuja@gmail.co",
				 "kadapa","607392011872", "UMMADI SINDHUJA", "04", "26", "126");
		
		
		
}
}
