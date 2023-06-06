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
		sheetName="oneWayTrip";
	}
	@Test(dataProvider="getFromExcel")
	public void oneWayTrip(String from, String to) {
		HomePage hp= new HomePage();
		hp.oneWaytripwithFamilyFriends(from, to);
		
	}
	@Test(dataProvider="getFromExcel")
	public void oneWayTrip1(String from, String to) {
		HomePage hp= new HomePage();
		hp.oneWaytripwithGovtEmployee(from, to);
	}
	

}
