package testCaseSpiceJet;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSpiceJet.BaseSpiceJet;
import pagesSpiceJet.HomePage;

public class Tc_005_OneWayTrip extends BaseSpiceJet {
	@BeforeTest
	public void setup() {
		testName = "tc_005_Trip";
		testDescription = "Tc_005_TripFunctionality";
		testCategory = "Regression";
		testAuthor = "sindhuja";
		
	}
	@Test
	public void oneWayTrip() {
		HomePage hp= new HomePage();
		hp.oneWaytrip("hyderabad", "Delhi");
		
	}
	

}
