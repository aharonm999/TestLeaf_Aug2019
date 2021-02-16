package com.leafBot.pages;

//import projectBase.ProjectSpecificMethods;
import com.leafBot.selenium.api.base.SeleniumBase;
//public class CcMyHomePage extends ProjectSpecificMethods{
	public class CcMyHomePage extends SeleniumBase{

	public DdMyLeadsPage clickLeads() {
	//driver.findElementByLinkText("Leads").click();
	click(locateElement("link","Leads"));
	// here we need to create an object since its moving to next page. i.e
	return new DdMyLeadsPage();
}

}