package stepsLoginAndLogout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginAndLogout {
	public ChromeDriver driver;
	@Given("Open the chrome browser")
	public void openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@And("Maximise the browser window")
	public void maximiseBrowser() {
		driver.manage().window().maximize();
	}
	
	@And("set the timeouts")
	public void setTimeouts() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@And("Load the Leaftaps URL")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps");
	}
	
	@And("Enter username")
	public void enterUserName() {
		driver.findElementById("username").sendKeys("demosalesmanager");
	}
	
	@And("Enter password")
	public void enterPassWord() {
		driver.findElementById("password").sendKeys("crmsfa");
	}
	
	@And("Click on the Login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("Click on Logout button")
	public void clickLogout() {
	driver.findElementByXPath("//input[@type='submit']").click();
	}

}