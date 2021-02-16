package pagesEditLead;

import projectBase.ProjectSpecificMethods;

public class DdMyLeadsPage extends ProjectSpecificMethods{
	
	public EeFindLeadsPage clickFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
		// here we need to create an object since its moving to next page. i.e
		return new EeFindLeadsPage();
	} 

}
