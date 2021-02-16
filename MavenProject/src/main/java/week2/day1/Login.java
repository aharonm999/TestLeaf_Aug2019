package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		// To Setup the Driver		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// To Launch the Chrome
		ChromeDriver driver = new ChromeDriver();
		// To Maximize the browser
		driver.manage().window().maximize();
		// To Load the URL
		driver.get("http://leaftaps.com/opentaps");
		// Find the UserName - one type of finding id and storing
		WebElement eleUserName = driver.findElementById("username");
		eleUserName.sendKeys("demosalesmanager");
		// Find the Password - another type of finding id
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Esdotcom");
		driver.findElementById("createLeadForm_firstName").sendKeys("Aharon");
		driver.findElementById("createLeadForm_lastName").sendKeys("M");
		driver.findElementByName("submitButton").click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
