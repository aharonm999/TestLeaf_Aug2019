package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindLastValueOfDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");

		// Finding the drop-down element
		WebElement eleDropDown1 = driver.findElementById("dropdown1");
		// Passing the element in select class for choosing the element by creating an Object
		Select ele = new Select(eleDropDown1);
		// For getting all options in the drop-down and the size of it
		List<WebElement> eleoptions = ele.getOptions();
		System.out.println(eleoptions.size()-1);
		ele.selectByIndex(eleoptions.size()-1);
	}

}
