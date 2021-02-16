package com.leafBot.pages;

//import projectBase.ProjectSpecificMethods;
import com.leafBot.selenium.api.base.SeleniumBase;
//public class BbHomePage extends ProjectSpecificMethods {
public class BbHomePage extends SeleniumBase{	

	public CcMyHomePage clickCRMSFALink() {
		//driver.findElementByLinkText("CRM/SFA").click();
		click(locateElement("link","CRM/SFA"));
		// here we need to create an object since its moving to next page. i.e
		return new CcMyHomePage();
	}
	

}
