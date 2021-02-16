package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindDropDownByThreeWays {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		WebElement eleDropDown1 = driver.findElementById("dropdown1");
		Select ele = new Select(eleDropDown1);
		
		// Drop-down can be selected in three ways. i.e 
		
		ele.selectByIndex(1);
		ele.selectByValue("1");
		ele.selectByVisibleText("Selenium");
		
	
		

	}

}
