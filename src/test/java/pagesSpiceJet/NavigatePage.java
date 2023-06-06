package pagesSpiceJet;

import org.openqa.selenium.support.PageFactory;

import baseSpiceJet.BaseSpiceJet;


public class NavigatePage extends BaseSpiceJet{
	
	public NavigatePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String spiceJetPageTitle() throws Exception {
		return getPageTitle();
	}
	
	public int urlResponseCode() throws Exception {
		return getResponseCode(readProperty("url"));
	}
}
 