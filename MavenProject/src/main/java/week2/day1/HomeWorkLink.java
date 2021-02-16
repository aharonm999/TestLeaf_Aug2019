package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkLink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		
		// Go to Home Page
		
		
		// Find where am supposed to go without clicking me?
		
		
		// Verify am I broken?
		
		
		// Go to Home Page (Interact with same link name)
		
		
		// How many links are available in this page?

	}

}
