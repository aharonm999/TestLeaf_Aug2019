package projectBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;


public class ProjectSpecificMethods {
	public String excelFileName;
	public static ChromeDriver driver; // Since this driver is using in another classes we are declaring as public
	
	@Parameters({"url"})
	@BeforeMethod
	public void startApp(String url) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	driver.get(url);
	/*driver.findElementById("username").sendKeys(username);
	driver.findElementById("password").sendKeys(password);
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();*/


}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	
	@DataProvider(name = "fetchData")
	public Object[][] getData() throws IOException {
		return ReadExcel.readExcelData(excelFileName);
	}
	
}