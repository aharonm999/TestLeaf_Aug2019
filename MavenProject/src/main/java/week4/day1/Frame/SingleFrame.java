package week4.day1.Frame;

import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		driver.findElementById("Click").click();
		String text = driver.findElementById("Click").getText();
		System.out.println(text);
		// To navigate default parent Frame/Window
		driver.switchTo().defaultContent();
		
	}

}
