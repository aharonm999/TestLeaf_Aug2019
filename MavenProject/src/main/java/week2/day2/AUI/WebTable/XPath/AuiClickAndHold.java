package week2.day2.AUI.WebTable.XPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AuiClickAndHold {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		
		WebElement Item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement Item4 = driver.findElementByXPath("//li[text()='Item 4']");
		
		//To select continuously four selectable values
		Actions builder = new Actions(driver);
		builder.clickAndHold(Item1).release(Item4).perform();
		
		//To select specific values 
		/*builder.sendKeys(Keys.CONTROL).click(Item1).click(Item4).perform();*/

	}

}
