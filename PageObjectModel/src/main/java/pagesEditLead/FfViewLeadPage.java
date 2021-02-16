package pagesEditLead;

import projectBase.ProjectSpecificMethods;

public class FfViewLeadPage extends ProjectSpecificMethods{

	public GgEditLeadPage clickEditButton() {
		driver.findElementByXPath("//a[text()='Edit']").click();
		return new GgEditLeadPage();
	}
}
