package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindListOfValuesFromDopDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");

		// Finding the drop-down element
		WebElement eleDropDown = driver.findElementById("dropdown1");
		// Passing the element in select class for choosing the element by creating an Object
		Select ele = new Select(eleDropDown);
		// For getting all options in the drop-down and the size of it
		List<WebElement> eleOptions = ele.getOptions();
		System.out.println(eleOptions.size());
		//for printing the values from the list of drop down elements
		for(WebElement eachOption: eleOptions) {
			System.out.println(eachOption.getText());
		}
	}

}

