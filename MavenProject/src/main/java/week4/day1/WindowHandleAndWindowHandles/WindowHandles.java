package week4.day1.WindowHandleAndWindowHandles;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/* - Go to the URL given
		 * - click on the 'Contact Us' text
		 * - Get the Title of second Window
		 * - Close the first window
		 * - Take the screenshot of the result  */
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementByLinkText("Contact Us").click();
		System.out.println(driver.getTitle());
		
		// For WindoHandles
		Set<String> winSet = driver.getWindowHandles();
		List<String> ls = new ArrayList<String>(winSet);
		driver.switchTo().window(ls.get(1));
		System.out.println(driver.getTitle());
		
		//Take Snap
		File src = driver.getScreenshotAs(OutputType.FILE);
		File obj = new File("./snaps/img.png");
		FileUtils.copyFile(src, obj);
		
		driver.switchTo().window(ls.get(0));
		driver.close();

	}

}
