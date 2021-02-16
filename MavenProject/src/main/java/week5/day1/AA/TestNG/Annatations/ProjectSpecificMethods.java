package week5.day1.AA.TestNG.Annatations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ProjectSpecificMethods {
	
	public ChromeDriver driver; // Since this driver is using in another classes we are declaring as public
	
	@BeforeMethod
	public void startApp() {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	driver.get("http://leaftaps.com/opentaps");
	driver.findElementById("username").sendKeys("demosalesmanager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();


}
	@AfterMethod
	public void closeApp() {
		driver.close();

	}
}