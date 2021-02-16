package week5.day1.AA.TestNG.Annatations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods{

	@Test	// when we use @Test - we will remove arguments and static key word from the main method.
	public void main() throws InterruptedException {

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

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Esdotcom");
		driver.findElementById("createLeadForm_firstName").sendKeys("Aharon");
		driver.findElementById("createLeadForm_lastName").sendKeys("M");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Sharon");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Kavin");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Ilavenil");

		WebElement SourceDropDown = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown1 = new Select(SourceDropDown);
		dropDown1.selectByIndex(4);

		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr.");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("600000");

		WebElement IndustryDropDown = driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown2 = new Select(IndustryDropDown);
		dropDown2.selectByIndex(3);

		WebElement OwnerShipDropDown = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown3 = new Select(OwnerShipDropDown);
		dropDown3.selectByIndex(2);

		driver.findElementById("createLeadForm_sicCode").sendKeys("1234");
		driver.findElementById("createLeadForm_description").sendKeys("Description has been Entered.");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Important note has been entered.");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("9");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("22");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("+91");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");

		WebElement CurrencyDropDown = driver.findElementById("createLeadForm_currencyUomId");
		Select dropDown4 = new Select(CurrencyDropDown);
		dropDown4.selectByValue("INR");

		driver.findElementById("createLeadForm_numberEmployees").sendKeys("90");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Smily");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Sharon");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.sharonm@gmail.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Bharath");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Line1");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Line2");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");

		WebElement StateDropDown = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dropDown5 = new Select(StateDropDown);
		dropDown5.selectByValue("IN");

		driver.findElementById("createLeadForm_generalCountryGeoId").sendKeys("India");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600045");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("1234");

		WebElement MarketingDropDown = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown6 = new Select(MarketingDropDown);
		dropDown6.selectByValue("9000");

		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("7449079777");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("msharon999@gmail.com");
		driver.findElementByName("submitButton").click();

		Thread.sleep(3000);	
		String verifyFristName = driver.findElementById("viewLead_firstName_sp").getText();
		if(verifyFristName.contains("Aharon")) {
			System.out.println("Verifying the First Name as: " + verifyFristName);
		}

		/*WebElement table = driver.findElementByXPath("(//table[contains(@id,'ext-gen')])[8]']");
			List<WebElement> allRows = table.findElements(By.tagName("tr"));
			System.out.println(allRows.size());

			Thread.sleep(3000);

			for (int i = 0; i < allRows.size(); i++) {
				WebElement firstRow = allRows.get(i);
				Thread.sleep(2000);
				List<WebElement> allColumns = firstRow.findElements(By.tagName("td"));
				System.out.println(allColumns.size());
				String text = allColumns.get(1).getText();
				System.out.println(text);
			}*/

		/*String title = driver.getTitle();
			System.out.println(title);*/
	}


}

