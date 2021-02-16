package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindDropDown {

	public static void main(String[] args) {

		// To Setup the Driver		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// To Launch the Chrome
		ChromeDriver driver = new ChromeDriver();
		// To Maximize the browser
		driver.manage().window().maximize();
		// To Load the URL
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		// Finding drop-down using "select" storing it as web element
		/*List<WebElement> WebElementDropDown = driver.findElementsByTagName("select");
		int size = WebElementDropDown.size(); // getting the size of drop-down
		System.out.println(size);
		
		driver.findElementById("dropdown1").sendKeys("Selenium"); // Selecting 1st value form the drop-down1
		driver.findElementByName("dropdown2").sendKeys("UFT/QTP");// Selecting 2nd value form the drop-down2
		driver.findElementById("dropdown3").sendKeys("Loadrunner");// Selecting 3rd value form the drop-down3
		driver.findElementByClassName("dropdown").sendKeys("Appium");// Selecting 4th value form the drop-down4
		driver.findElementByXPath("(//select)[5]").sendKeys("Loadrunner");*/
	
		//Selecting drop-down value using "index".
		WebElement eleDrpDwn1 = driver.findElementById("dropdown1");
		Select ele1 = new Select(eleDrpDwn1);
		ele1.selectByIndex(1);
		
		//Selecting drop-down value using "Text"
		WebElement eleDrpDwn2 = driver.findElementByName("dropdown2");
		Select ele2 = new Select(eleDrpDwn2);
		ele2.selectByVisibleText("Appium");
		
		//Selecting drop-down using "value"
		WebElement eleDrpDwn3 = driver.findElementByName("dropdown3");
		Select ele3 = new Select(eleDrpDwn3);
		ele3.selectByValue("3");
		
		//Get the number of drop-down options
		WebElement listOfValues = driver.findElementByClassName("dropdown");
		Select ele = new Select(listOfValues);
		List<WebElement> options = ele.getOptions();
		for(WebElement eachOption: options) {
			System.out.println(eachOption.getText());
		}
		
		//Use sendKeys to select drop-down value
		driver.findElementByXPath("(//select)[5]").sendKeys("Loadrunner");
		
		//Select a program from drop-down
		//driver.findElementByXPath("(//option[text()='Select your programs']/following-sibling::option)[2]").sendKeys("Appium");
		
		
	}

}
