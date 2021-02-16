package pagesCreateLead;

import seleniumBase.SeleniumBase;

public class EeCreateLeadPage extends SeleniumBase{
	
	public EeCreateLeadPage enterCompanyName(String cName) {
		clearAndType(locateElement("id", "createLeadForm_companyName"),cName);
		return this;
	}
	
	public EeCreateLeadPage enterFristName(String fName) {
		clearAndType(locateElement("id", "createLeadForm_firstName"),fName);
		return this;
	}
	
	public EeCreateLeadPage enterLastName(String lName) {
		clearAndType(locateElement("id", "createLeadForm_lastName"),lName);
		return this;
	}
	
	public FfViewLeadPage clickCreateLeadButton() {
		click(locateElement("name","submitButton"));
		// here we need to create an object since its moving to next page. i.e
		return new FfViewLeadPage();
	}

}
