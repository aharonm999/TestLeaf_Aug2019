package pagesCreateLead;

import projectBase.ProjectSpecificMethods;

public class BbHomePage extends ProjectSpecificMethods {
	
	public CcMyHomePage clickCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
		// here we need to create an object since its moving to next page. i.e
		return new CcMyHomePage();
	}
	

}
