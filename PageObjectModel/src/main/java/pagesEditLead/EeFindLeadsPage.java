package pagesEditLead;

import projectBase.ProjectSpecificMethods;

public class EeFindLeadsPage extends ProjectSpecificMethods{
	
	public EeFindLeadsPage enterFirstName(String name) {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(name);
		return this;
	}
	
	public EeFindLeadsPage clickFindLeadsButton() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		return this;
	}
	
	public FfViewLeadPage clickFirstResultingName() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		return new FfViewLeadPage();
	}
}
