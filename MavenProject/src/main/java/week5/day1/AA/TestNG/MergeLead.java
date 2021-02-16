package week5.day1.AA.TestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MergeLead {

	@Test	// when we use @Test - we will remove arguments and static key word from the main method.

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
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();

		//Move to new window
		Set<String> newWindowOne = driver.getWindowHandles();
		List<String> fristWindow = new ArrayList<String>(newWindowOne);
		driver.switchTo().window(fristWindow.get(1));
		System.out.println("New Window Title Is: " + driver.getTitle());

		driver.findElementByName("id").sendKeys("10274");
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		Thread.sleep(3000);

		//Switch back to primary window
		driver.switchTo().window(fristWindow.get(0));
		System.out.println("Primary Window Title is: " + driver.getTitle());
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();

		//Move to new window
		Set<String> newWindowTwo = driver.getWindowHandles();
		List<String> secondWindow = new ArrayList<String>(newWindowTwo);
		driver.switchTo().window(secondWindow.get(1));
		System.out.println("New Window Title Is: " + driver.getTitle());

		driver.findElementByName("id").sendKeys("10275");
		driver.findElementByXPath("//button[contains(text(),'Find')]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		Thread.sleep(3000);

		//Switch back to primary window
		driver.switchTo().window(fristWindow.get(0));
		System.out.println("Primary Window Title is: " + driver.getTitle());

		driver.findElementByClassName("buttonDangerous").click();
		Thread.sleep(3000);
		//Accept Alert
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Message: " + alertText);
		driver.switchTo().alert().accept();

		Thread.sleep(3000);
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys("10274");
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		//Verify message "No records to display" in the Lead List. This message confirms the successful merge of leads.
		String verifyMessage = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if(verifyMessage.contains("No records to display")) {
			System.out.println("Veryfied Message: " + verifyMessage);
		}else {
			System.out.println("Message Not Matched");
		}

		driver.close();

	}

}
