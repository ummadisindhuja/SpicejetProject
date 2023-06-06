package testCaseSpiceJet;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSpiceJet.BaseSpiceJet;
import pagesSpiceJet.Bookingpage;
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
		hp.flightToBooking("Hyderabad", "Delhi");
		Bookingpage bp= new Bookingpage();
		bp.fillDetailsforBooking("ummadi", "sindhuja", "8522098804", "ummadimails.ummadisindhuja@gmail.co",
				"India", "kadapa");
		bp.paymentInfo("607392011972", "UMMADI SINDHUJA", "04", "26", "035");
		
}
}
