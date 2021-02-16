package pagesCreateLead;

import projectBase.ProjectSpecificMethods;

public class DdMyLeadsPage extends ProjectSpecificMethods{
	
	public EeCreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		// here we need to create an object since its moving to next page. i.e
		return new EeCreateLeadPage();
	} 

}
