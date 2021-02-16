package pagesCreateLead;

import seleniumBase.SeleniumBase;

public class FfViewLeadPage extends SeleniumBase{

	public FfViewLeadPage verifyFirstName(String fName) {
		/*String verifyFristName = driver.findElementById("viewLead_firstName_sp").getText();
		if(verifyFristName.contains(fName)) {
			System.out.println("Verifying the First Name as: " + verifyFristName);
		}*/
		verifyExactText(locateElement("id", "viewLead_firstName_sp"), fName);
		return this;
	}
}
