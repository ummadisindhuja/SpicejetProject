package testCaseSpiceJet;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSpiceJet.BaseSpiceJet;
import pagesSpiceJet.HomePage;

public class Tc_005_RoundTrip extends BaseSpiceJet{
	@BeforeTest
	public void setup() {
		testName = "tc_005_Trip";
		testDescription = "Tc_005_TripFunctionality";
		testCategory = "Regression";
		testAuthor = "sindhuja";
		sheetName="roundTrip";//sheet naot saving-----------------------------------------
	}
	@Test(dataProvider="getFromExcel")
	public void roundTrip(String from, String to) {
		HomePage hp= new HomePage();
		hp.roundTripwithGovtEmployee(from, to);
		
	}

}
