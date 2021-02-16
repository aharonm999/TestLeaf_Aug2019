package week2.day2.AUI.WebTable.XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathClassWork1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Launch Erail "http://erail.in"
		// Clear From station and type MAS and Tab
		// Clear To station and type SBC and Tab
		// Print the Train number of MYSURU exp (Using Xpath)
		// Print the departure time of Train no 12007 (Using xpath)
		
		driver.get("http://erail.in");
		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("MAS",Keys.TAB);
		driver.findElementByXPath("//input[@id='txtStationTo']").clear();
		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("SBC",Keys.TAB);

		WebElement table = driver.findElementByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']");
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		System.out.println(allRows.size());
		WebElement thirdRow = allRows.get(2);
		
		List<WebElement> allColumns = thirdRow.findElements(By.tagName("td"));
		System.out.println(allColumns.size());
		String text = allColumns.get(1).getText();
		System.out.println(text);
		

	}

}
