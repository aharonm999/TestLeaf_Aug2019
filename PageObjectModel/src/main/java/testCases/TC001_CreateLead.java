package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesCreateLead.AaLoginPage;
import pagesCreateLead.BbHomePage;
import pagesCreateLead.CcMyHomePage;
import pagesCreateLead.DdMyLeadsPage;
import pagesCreateLead.EeCreateLeadPage;
import pagesCreateLead.FfViewLeadPage;
import projectBase.ProjectSpecificMethods;

public class TC001_CreateLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName = "TC001";
	}
	@Test(dataProvider="fetchData")
	
	// It is one type calling all pages by creating a new Object 
	/*public void loginTestCases(String uName, String pWord, String cName, String fName, String lName) {
		new AaLoginPage().enterUsername(uName).enterPassword(pWord).clcikLogin();
		new BbHomePage().clickCRMSFALink();
		new CcMyHomePage().clickLeads();
		new DdMyLeadsPage().clickCreateLead();
		new EeCreateLeadPage().enterCompanyName(cName).enterFristName(fName).enterLastName(lName).clickCreateLeadButton();
		new FfViewLeadPage().verifyFirstName(fName);
	}*/
	
	/* It is Another type of call all pages from Loginpage itself. Since all methods extends ProjectSpecificMethods in a single class 
	we can call all pages methods like shown below */
	
	public void loginTestCases(String uName, String pWord, String cName, String fName, String lName) {
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