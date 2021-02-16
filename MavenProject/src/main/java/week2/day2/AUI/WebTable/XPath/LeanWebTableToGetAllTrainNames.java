package week2.day2.AUI.WebTable.XPath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeanWebTableToGetAllTrainNames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Launch Erail "http://erail.in"
		// Clear From station and type MAS and Tab
		// Clear To station and type SBC and Tab
		// Finding The all train names exist in the second column from the table 
		
		driver.get("http://erail.in");
		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("MAS",Keys.TAB);
		driver.findElementByXPath("//input[@id='txtStationTo']").clear();
		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("SBC",Keys.TAB);
		Thread.sleep(5000);
		
		WebElement eleCheckBox = driver.findElementById("chkSelectDateOnly");
		if(eleCheckBox.isSelected()) {
			eleCheckBox.click();
		}
		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']");
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
		}
	
		
	}

}
