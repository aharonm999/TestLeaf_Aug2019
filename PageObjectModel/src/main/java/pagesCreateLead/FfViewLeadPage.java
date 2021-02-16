package pagesCreateLead;

import projectBase.ProjectSpecificMethods;

public class FfViewLeadPage extends ProjectSpecificMethods{

	public FfViewLeadPage verifyFirstName(String fName) {
		String verifyFristName = driver.findElementById("viewLead_firstName_sp").getText();
		if(verifyFristName.contains(fName)) {
			System.out.println("Verifying the First Name as: " + verifyFristName);
		}
		return this;
	}
}
