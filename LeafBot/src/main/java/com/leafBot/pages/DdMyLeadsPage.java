package com.leafBot.pages;

//import projectBase.ProjectSpecificMethods;
import com.leafBot.selenium.api.base.SeleniumBase;
//public class DdMyLeadsPage extends ProjectSpecificMethods{
	public class DdMyLeadsPage extends SeleniumBase{

	public EeCreateLeadPage clickCreateLead() {
		//driver.findElementByLinkText("Create Lead").click();
		click(locateElement("link","Create Lead"));
		// here we need to create an object since its moving to next page. i.e
		return new EeCreateLeadPage();
	} 

}
