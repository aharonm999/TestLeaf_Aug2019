package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkCheckBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		// Select the languages that you know?
		driver.findElementByXPath("(//input[@type='checkbox'])[1]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[4]").click();
		// Confirm Selenium is checked
		boolean selected = driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
		if(selected) {
			System.out.println("Selected");
		}else {
			System.out.println("NotSelected");
		}
			
		// DeSelect only checked
		driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
		
		// Select all below checkboxes
		List<WebElement> list = driver.findElementsByXPath("(//label[text()='Select all below checkboxes ']/following::input)[1]");
		int size = list.size();
		System.out.println(size);
		/*for(WebElement ele: list) {
			if(!ele.isSelected()) {
				ele.click();
			}
		}*/
		
		

	}

}
