package pagesEditLead;

import projectBase.ProjectSpecificMethods;

public class GgEditLeadPage extends ProjectSpecificMethods{
	
	public GgEditLeadPage clearCmpName() {
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		return this;
	}
	
	public GgEditLeadPage enterCmpName(String cName) {
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys(cName);
		return this;
	}
	
	public GgEditLeadPage clearFirstName() {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").clear();
		return this;
	}

	public GgEditLeadPage enterFristName(String fName) {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fName);
		return this;
	}
	
	public GgEditLeadPage clearLastName() {
		driver.findElementByXPath("(//input[@name='lastName'])[3]").clear();
		return this;
	}
	
	public GgEditLeadPage enterLastName(String lName) {
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys(lName);
		return this;
	}
	
	public GgEditLeadPage clickUpdateButton() {
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		return this;
	}
}
