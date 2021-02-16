package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesEditLead.AaLoginPage;
import projectBase.ProjectSpecificMethods;

public class TC002_EditLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName = "TC002";
	}
	@Test(dataProvider="fetchData")
	public void editLeadTestCases(String uName, String pWord, String name, String cName, String fName, String lName) throws InterruptedException {
		
		new AaLoginPage().enterUsername(uName)
		.enterPassword(pWord)
		.clcikLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(name)
		.clickFindLeadsButton()
		.clickFirstResultingName()
		.clickEditButton()
		.clearCmpName()
		.enterCmpName(cName)
		.clearFirstName()
		.enterFristName(fName)
		.clearLastName()
		.enterLastName(lName)
		.clickUpdateButton();
	}

}
