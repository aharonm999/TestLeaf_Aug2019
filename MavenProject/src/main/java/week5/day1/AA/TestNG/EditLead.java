package week5.day1.AA.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead {

	@Test 	// when we use @Test - we will remove arguments and static key word from the main method.
	
	public void main() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Aharon");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//Click on first resulting lead
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();

		//Verify title of the page	
		String title = driver.getTitle();
		System.out.println("Title of the Page is: " + title);

		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("ProtechSoft");	
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();

		//Confirm the changed name appears
		String confirmingEditedName = driver.findElementById("viewLead_companyName_sp").getText();
		if(confirmingEditedName.contains("ProtechSoft")) {
			System.out.println("Confirming Changed Name is: " + confirmingEditedName);
		}
		driver.close();

	}
}
