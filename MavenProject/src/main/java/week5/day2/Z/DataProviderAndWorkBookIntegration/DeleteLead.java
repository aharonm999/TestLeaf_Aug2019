package week5.day2.Z.DataProviderAndWorkBookIntegration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead extends ProjectSpecificMethods{

	@Test  // when we use @Test - we will remove arguments and static key word from the main method.
	public void main() throws InterruptedException {

	/*  We are commenting and moving all commented steps to "ProjectSpecificMethods" class,
		because these all are repeated actions.
		Since these are startup steps we need to move "@BeforeMethod"	*/

	/*	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();				*/

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("7449079777");		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//Capture lead ID of First Resulting lead
		String firstResultingLeadId = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		System.out.println("Captured Frist Resulting Lead Id is: " + firstResultingLeadId);

		Thread.sleep(3000);
		//Click First Resulting lead
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByXPath("//a[text()='Delete']").click();
		driver.findElementByLinkText("Find Leads").click();
		//Enter captured lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys(firstResultingLeadId);
		//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String verifyMessage = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if(verifyMessage.contains("No records to display")) {
			System.out.println("Veryfied Message: " + verifyMessage);
		}else {
			System.out.println("Message Not Matched");
		}
		//Close the browser (Do not log out)
		//driver.close();

	}
}
