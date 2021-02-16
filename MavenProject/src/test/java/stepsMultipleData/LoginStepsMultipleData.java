package stepsMultipleData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepsMultipleData {
	
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

	@Given("Enter the UserName as (.*)")
	public void enterTheUserName(String userName) {
		driver.findElementById("username").sendKeys(userName);
	}

	@Given("Enter the PassWord as (.*)")
	public void enterThePassWord(String passWord) {
		driver.findElementById("password").sendKeys(passWord);
	}

	@When("Click on the Login Button")
	public void clickOnTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Given("Click CRMSFA Link")
	public void clickOnCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@Given("Click on CreateLead")
	public void clickOnCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter the CompnayName as (.*)")
	public void enterTheCompnayName(String cmpName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cmpName);
	}

	@Given("Enter the FirstName as (.*)")
	public void enterTheFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}

	@Given("Enter the LastName as (.*)")
	public void enterTheLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}

	@Then("Click on SubmitButton")
	public void clickOnSubmitButton() {
		driver.findElementByName("submitButton").click();
	}

}
