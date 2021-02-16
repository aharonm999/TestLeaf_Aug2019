package pagesCreateLead;

import seleniumBase.SeleniumBase;

public class BbHomePage extends SeleniumBase {
	
	public CcMyHomePage clickCRMSFALink() {
		click(locateElement("link","CRM/SFA"));
		// here we need to create an object since its moving to next page. i.e
		return new CcMyHomePage();
	}
	

}
