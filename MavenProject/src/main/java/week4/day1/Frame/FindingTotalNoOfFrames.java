package week4.day1.Frame;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindingTotalNoOfFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		
		

	}

}
