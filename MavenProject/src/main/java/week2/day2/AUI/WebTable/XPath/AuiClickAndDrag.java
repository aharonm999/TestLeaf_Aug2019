package week2.day2.AUI.WebTable.XPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AuiClickAndDrag {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		Actions builder = new Actions(driver);
		driver.switchTo().frame(0);

		WebElement drag1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement drag2 = driver.findElementByXPath("//li[text()='Item 2']");
		
		int x = drag1.getLocation().getX();
		int y = drag2.getLocation().getY();
	
		builder.dragAndDropBy(drag1, x, y).perform();

	}

}
