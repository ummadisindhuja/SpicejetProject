package testCaseSpiceJet;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSpiceJet.BaseSpiceJet;
import pagesSpiceJet.HomePage;

public class Tc_006_SelectFlightToBooking extends BaseSpiceJet{
	@BeforeTest
	public void setup() {
		testName = "tc_006_Select Flight and Booking";
		testDescription = "Select Flight and proceed to booking page";
		testCategory = "Regression";
		testAuthor = "Sindhuja";
	}
@Test
public void ticketBooking() {
	HomePage hp = new HomePage();
	hp.flightToBooking("hyderabad", "Delhi");
}


}
