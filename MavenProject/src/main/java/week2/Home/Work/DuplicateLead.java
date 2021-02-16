package week2.Home.Work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("msharon999@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//Capture name of First Resulting lead
		String firstResultingLead = driver.findElementByXPath("//a[text()='Aharon']").getText();
		System.out.println("Name of First Resulting Lead: " + firstResultingLead);
		//Click First Resulting lead
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		//Click Duplicate Lead
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		//Verify the title as 'Duplicate Lead'
		String verifyTitle = driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();
		if(verifyTitle.contains("Duplicate Lead")) {
			System.out.println("Verified Title as: " + verifyTitle);
		}
		//Click Create Lead
		driver.findElementByName("submitButton").click();
		//Confirm the duplicated lead name is same as captured name
		String confirmName = driver.findElementByXPath("//span[text()='Aharon']").getText();
		if(confirmName.equals(firstResultingLead)) {
			System.out.println("Name is same as captured Name: " + confirmName);
		}
		//Close the browser (Do not log out)
		driver.close();

	}

}
