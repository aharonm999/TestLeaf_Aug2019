package week5.day2.WorkBookorExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethods{

	@Test(dataProvider="fetchData") 	// when we use @Test - we will remove arguments and static key word from the main method.
	public void main(String fName, String lName, String cName) throws InterruptedException {
		
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
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fName);
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys(lName);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//Click on first resulting lead
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		
		//Verify title of the page	
		String title = driver.getTitle();
		System.out.println("Title of the Page is: " + title);
		
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys(cName);	
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		
		//Confirm the changed name appears
		String confirmingEditedName = driver.findElementById("viewLead_companyName_sp").getText();
		if(confirmingEditedName.contains("ProtechSoft")) {
			System.out.println("Confirming Changed Name is: " + confirmingEditedName);
		}
		//driver.close();

	}
	
	@DataProvider(name="fetchData") //Here we are giving 'name' to identify the DataProvider. It will helps when we have multiple Dataproviders
	public Object[][] getData(){
		
		String[][] data = new String[2][3];
		
		data[0][0] = "Kavin";
		data[0][1] = "Ilavenil";
		data[0][2] = "Protech";
		
		data[1][0] = "Blossom";
		data[1][1] = "Mummy";
		data[1][2] = "Gbox";
		
		return data;
}
}