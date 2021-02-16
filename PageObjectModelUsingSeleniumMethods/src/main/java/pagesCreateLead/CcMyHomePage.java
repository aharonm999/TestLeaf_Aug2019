package pagesCreateLead;

import seleniumBase.SeleniumBase;

public class CcMyHomePage extends SeleniumBase{

	public DdMyLeadsPage clickLeads() {
		click(locateElement("link","Leads"));
		// here we need to create an object since its moving to next page. i.e
		return new DdMyLeadsPage();
	}

}