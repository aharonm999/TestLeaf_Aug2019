package stepsDataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepsDataProvider {
	
	/* Scenario2: Feature methods implementation class (DataProvider)
	 * Step1: Need to implement java methods for all features which we have mentioned in "Login.feature1" file.
	 * Step2: Need to annotate all methods using @Given/@And/@Then - we can use any one of these.
	 * Step3: Need to pass the exact text which is given in "Login.feature1" file. Make sure there is no mismatch in text.
	 * Step4: Inside the @Given() annotation text add "as (.*)" to add the data which is given in "Login.feature1".
	 * 		  - (.*) --> using this returns the text what ever we are giving in features file
	 * Step5: Now need to pass the arguments in the method where we are exactly passing the data
	 * 		  in order to avoid hard coding. */
	
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
