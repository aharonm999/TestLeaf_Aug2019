package week2.day2.AUI.WebTable.XPath;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathClassWork {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch amazon.in
		// Select Electronics from Categories 
		// Type "Redmi" enter using sendkeys
		// print 2nd price value

		driver.get("http://amazon.in");
		driver.findElementByXPath("//select[@id='searchDropdownBox']").click();
		driver.findElementByXPath("//select[@id='searchDropdownBox']/option[17]").click();
		driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys("Redmi", Keys.ENTER);
		WebElement elePrice = driver.findElementByXPath("(//span[@class='a-price-whole'])[2]");
		System.out.println(elePrice.getText());


	}

}
