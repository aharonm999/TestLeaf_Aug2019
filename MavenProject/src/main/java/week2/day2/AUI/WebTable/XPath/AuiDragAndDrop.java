package week2.day2.AUI.WebTable.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AuiDragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		Actions builder = new Actions(driver);
		WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("droppable");
		builder.dragAndDrop(drag, drop).perform();

	}

}
