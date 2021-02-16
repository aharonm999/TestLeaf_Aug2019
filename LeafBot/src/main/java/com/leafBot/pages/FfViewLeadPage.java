package com.leafBot.pages;

//import org.openqa.selenium.WebElement;
//import projectBase.ProjectSpecificMethods;
import com.leafBot.selenium.api.base.SeleniumBase;
//public class FfViewLeadPage extends ProjectSpecificMethods{
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
