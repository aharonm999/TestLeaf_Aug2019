package com.leafBot.pages;

//import projectBase.ProjectSpecificMethods;
import com.leafBot.selenium.api.base.SeleniumBase;
//public class EeCreateLeadPage extends ProjectSpecificMethods{
	public class EeCreateLeadPage extends SeleniumBase{
		
	public EeCreateLeadPage enterCompanyName(String cName) {
		//driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		clearAndType(locateElement("id", "createLeadForm_companyName"),cName);
		return this;
	}
	
	public EeCreateLeadPage enterFristName(String fName) {
		//driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		clearAndType(locateElement("id", "createLeadForm_firstName"),fName);
		return this;
	}
	
	public EeCreateLeadPage enterLastName(String lName) {
		//driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		clearAndType(locateElement("id", "createLeadForm_lastName"),lName);
		return this;
	}
	
	public FfViewLeadPage clickCreateLeadButton() {
		//driver.findElementByName("submitButton").click();
		click(locateElement("name","submitButton"));
		// here we need to create an object since its moving to next page. i.e
		return new FfViewLeadPage();
	}

}
