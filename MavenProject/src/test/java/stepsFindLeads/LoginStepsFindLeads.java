package stepsFindLeads;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepsFindLeads {
	
	public ChromeDriver driver;
	
	@Given("Open the chrome browser")
	public void openTheChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Maximise the browser")
	public void maximiseTheBrowser() {
		driver.manage().window().maximize();
	}

	@Given("Set the Timeouts")
	public void setTheTimeouts() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Load the url")
	public void loadTheUrl() {
		driver.get("http://leaftaps.com/opentaps");
	}

	@Given("Enter the UserName")
	public void enterTheUserName() {
		driver.findElementById("username").sendKeys("demosalesmanager");
	}

	@Given("Enter the Password")
	public void enterThePassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("Click on the login button")
	public void clickOnTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@When("Click crm\\/sfa link")
	public void clickCrmSfaLink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@When("Click on Leads Tab")
	public void clickOnLeadsTab() {
	    driver.findElementByLinkText("Leads").click();
	}

	@When("Click on Find Leads submenu from Shorcuts menu")
	public void clickOnFindLeadsSubmenuFromShorcutsMenu() {
	    driver.findElementByLinkText("Find Leads").click();
	}

	@When("Enter First Name")
	public void enterFirstName() {
	    driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Aharon");
	}

	@Then("Click on Find Leads button")
	public void clickOnFindLeadsButton() {
	    driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
	}

}
