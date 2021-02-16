package pagesCreateLead;

import projectBase.ProjectSpecificMethods;

public class AaLoginPage extends ProjectSpecificMethods{
	
	public AaLoginPage enterUsername(String uName) {
		driver.findElementById("username").sendKeys(uName);
		return this;
	}

	public AaLoginPage enterPassword(String pWord) {
		driver.findElementById("password").sendKeys(pWord);
		return this;
	}
	
	public BbHomePage clcikLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		// here we need to create an object since its moving to next page. i.e
		return new BbHomePage();
	}
	
}
