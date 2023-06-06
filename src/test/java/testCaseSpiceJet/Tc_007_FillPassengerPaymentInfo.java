package testCaseSpiceJet;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSpiceJet.BaseSpiceJet;
import pagesSpiceJet.Bookingpage;
import pagesSpiceJet.HomePage;

public class Tc_007_FillPassengerPaymentInfo extends BaseSpiceJet{
	@BeforeTest
	public void setup() {
		testName = "tc_007_FillPassengerPaymentInfo";
		testDescription = "Select Flight and proceed to booking page";
		testCategory = "Regression";
		testAuthor = "Sindhuja";
	}
	@Test
	public void dummyPassengerAndPaymentInfo() {
		HomePage hp = new HomePage();
		hp.flightToBooking("Hyderabad", "Delhi");
		Bookingpage bp= new Bookingpage();
		bp.fillDetailsforBooking("ummadi", "sindhuja", "8522098804", "ummadimails.ummadisindhuja@gmail.co",
				"India", "kadapa");
		
}
}