package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkEdit {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		// Enter Your email address
		driver.findElementById("email").sendKeys("msharon999@gmail.com");
		
		// Append a text and press keyboard tab
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("text", Keys.TAB);
		
		// Get default text entered
		WebElement ele1 = driver.findElementByName("username");
		System.out.println(ele1.getAttribute("value"));
		
		// Clear the text
		WebElement ele2 = driver.findElementByName("username");
		ele2.clear();
		
		// Confirm that edit field is disabled
		boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		if(enabled==false) {
			System.out.println("Element is disabled");
		}
	}

}
