package pagesCreateLead;

import projectBase.ProjectSpecificMethods;

public class EeCreateLeadPage extends ProjectSpecificMethods{
	
	public EeCreateLeadPage enterCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		return this;
	}
	
	public EeCreateLeadPage enterFristName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		return this;
	}
	
	public EeCreateLeadPage enterLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		return this;
	}
	
	public FfViewLeadPage clickCreateLeadButton() {
		driver.findElementByName("submitButton").click();
		// here we need to create an object since its moving to next page. i.e
		return new FfViewLeadPage();
	}

}
