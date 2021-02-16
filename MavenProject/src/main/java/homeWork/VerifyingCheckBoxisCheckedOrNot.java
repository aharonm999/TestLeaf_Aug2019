package homeWork;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyingCheckBoxisCheckedOrNot {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElementByLinkText("Sign up").click();
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select dropdown = new Select(country);
		List<WebElement> allob = dropdown.getOptions();
		for (WebElement eachop : allob) {			
			System.out.println(eachop.getText());
		}
		int i = 0;
		i++;
		}


	}


