package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.AaLoginPage;
//import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_CreateLead extends  ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
		testcaseName="CreateLead";
		testcaseDec = "CreateLead to Leaftaps";
		author="Aharon";
		category="smoke";
		
	}
	
	@Test(dataProvider="fetchData")
	public void runTC001(String uName, String pWord, String cName, String fName, String lName) {
		new AaLoginPage()
		.enterUsername(uName)
		.enterPassword(pWord)
		.clcikLogin()
		.clickCRMSFALink()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFristName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton()
		.verifyFirstName(fName);
	}

}
