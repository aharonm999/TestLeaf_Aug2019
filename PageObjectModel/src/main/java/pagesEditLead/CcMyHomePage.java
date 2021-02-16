package pagesEditLead;

import projectBase.ProjectSpecificMethods;

public class CcMyHomePage extends ProjectSpecificMethods{
	
	public DdMyLeadsPage clickLeads() {
	driver.findElementByLinkText("Leads").click();
	// here we need to create an object since its moving to next page. i.e
	return new DdMyLeadsPage();
}

}