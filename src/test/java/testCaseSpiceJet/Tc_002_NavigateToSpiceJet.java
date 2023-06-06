package testCaseSpiceJet;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSpiceJet.BaseSpiceJet;
import pagesSpiceJet.NavigatePage;
import utilsSpiceJet.UtilSpiceJet;


public class Tc_002_NavigateToSpiceJet extends BaseSpiceJet{
	@BeforeTest
	public void setup() {
		testName = "tc_001_navgatingToSpiceJettApp";
		testDescription = "Navigating to the SpiceJet WebApllication";
		testCategory = "Regression";
		testAuthor = "Sindhuja";
	}
	@Test
	public void tc_01_navgatingToSpiceJetApp() throws Exception {
		
		NavigatePage tittle = new NavigatePage();
		//tittle.launchUrl();
		
		String actTitle = tittle.spiceJetPageTitle();
		String expTitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		Assert.assertEquals( actTitle, expTitle);
		
		//softAssert(actTitle, expTitle);
		if (actTitle.equals(expTitle)) {
			reportStep("Validating SpiceJet Page Title - Pass", "Pass", testName);
		} else {
			reportStep("Validating SpiceJet Page Title - Fail", "Fail", testName);
		}
		//naviagte page
	}

}
