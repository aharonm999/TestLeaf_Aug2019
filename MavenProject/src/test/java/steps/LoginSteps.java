package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	/* Scenario1: Feature methods implementation class (Normal/Default Cucumber Feature file)
	 * Step1: Need to implement java methods for all features which we have mentioned in feature file.
	 * Step2: Need to annotate all methods using @Given/@And/@Then - we can use any one of these.
	 * Step3: Need to pass the exact text which is given in feature file. Make sure there is no mismatch in text.*/
	
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
	
	@Given("Click on CreateLead")
	public void clickOnCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter the CompnayName")
	public void enterTheCompnayName() {
		driver.findElementById("createLeadForm_companyName").sendKeys("Esdotcom");
	}

	@Given("Enter the FirstName")
	public void enterTheFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Aharon");
	}

	@Given("Enter the LastName")
	public void enterTheLastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("M");
	}

	@Then("Click on SubmitButton")
	public void clickOnSubmitButton() {
		driver.findElementByName("submitButton").click();
	}

}
