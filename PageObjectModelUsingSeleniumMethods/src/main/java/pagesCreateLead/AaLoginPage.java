package pagesCreateLead;

import seleniumBase.SeleniumBase;

public class AaLoginPage extends SeleniumBase{
	
	public AaLoginPage enterUsername(String uName) {
		clearAndType(locateElement("id", "username"),uName);
		return this;
	}

	public AaLoginPage enterPassword(String pWord) {
		clearAndType(locateElement("id", "password"),pWord);
		return this;
	}
	
	public BbHomePage clcikLogin() {
		click(locateElement("class","decorativeSubmit"));
		// here we need to create an object since its moving to next page. i.e
		return new BbHomePage();
	}
	
}
