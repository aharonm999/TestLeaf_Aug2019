package week2.day2.AUI.WebTable.XPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AuiDroppableSamePlace {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		//Performing DRAG and DROP for a single object
		WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("draggable");
		
		int x = drag.getLocation().getX();
		System.out.println("x"+x);
		int y = drag.getLocation().getY();
		System.out.println("y"+y);
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop).perform();
		
		WebElement drag1 = driver.findElementById("draggable");
		Point xx = drag1.getLocation();
		
		Thread.sleep(3000);
		builder.dragAndDropBy(drag, x, y).perform();
		
		int x1 = drag.getLocation().getX();
		System.out.println("x11"+x1);
		int y1 = drag.getLocation().getY();
		System.out.println("y1"+y1);
		
		//to set the dropped object to default place1
		int y2 = 0;
		int X1=0;
		builder.dragAndDropBy(drag, -(x1-X1), -(y1-y2)).perform();



	}

}


