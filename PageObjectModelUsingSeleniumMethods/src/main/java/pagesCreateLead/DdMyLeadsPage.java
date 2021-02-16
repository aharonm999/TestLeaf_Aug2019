package pagesCreateLead;

import seleniumBase.SeleniumBase;

public class DdMyLeadsPage extends SeleniumBase{
	
	public EeCreateLeadPage clickCreateLead() {
		click(locateElement("link","Create Lead"));
		// here we need to create an object since its moving to next page. i.e
		return new EeCreateLeadPage();
	} 

}
