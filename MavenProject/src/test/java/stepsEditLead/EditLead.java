package stepsEditLead;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class EditLead {
	
	public ChromeDriver driver;
	
	@Given("Open the Chrome Browser")
	public void openTheChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Maximise the Browser")
	public void maximiseTheBrowser() {
		driver.manage().window().maximize();
	}

	@Given("Set the TimeOuts")
	public void setTheTimeOuts() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Load the URL")
	public void loadTheURL() {
		driver.get("http://leaftaps.com/opentaps");
	}

	@Given("Enter the UserName")
	public void enterTheUserName() {
		driver.findElementById("username").sendKeys("demosalesmanager");
	}

	@Given("Enter the PassWord")
	public void enterThePassWord() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("Click on the Login Button")
	public void clickOnTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Given("Click CRMSFA Link")
	public void clickOnCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("Click on Leads Tab")
	public void clickLeadsTab() {
		driver.findElementByLinkText("Leads").click();
	}
	
	@Given("Click on Find Leads button")
	public void clickFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
	}
	
	@Given("Enter the FirstName")
	public void enterFirstName() {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("aaaa");
	}
	
	@Given("Click on Findleads button")
	public void clickFindLeadsButton() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
	}
	
	@Given("Click on first resulting lead")
	public void clickResultLead() {
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
	}
	
	@Given("Verify title of the page")
	public void verifyTitlePage() {
		String title = driver.getTitle();
		System.out.println("Title of the Page is: " + title);
	}
	
	@Given("Clcik on edit button")
	public void clickEditButton() {
		driver.findElementByXPath("//a[text()='Edit']").click();
	}
	
	@Given("Clear compnay name")
	public void clickCmpnyName() {
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
	}
	
	@Given("Enter compnay name")
	public void enterCmpnyName() {
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("ProtechSoft");
	}
	
	@Given("Click on update button")
	public void clickUpdateButton() {
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
	}
	
	@Given("Confirm the changed name")
	public void confimrChangedName() {
		String confirmingEditedName = driver.findElementById("viewLead_companyName_sp").getText();
		if(confirmingEditedName.contains("ProtechSoft")) {
			System.out.println("Confirming Changed Name is: " + confirmingEditedName);
		}
		driver.close();
	}
	 
	
}
