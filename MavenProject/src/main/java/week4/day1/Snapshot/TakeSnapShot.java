package week4.day1.Snapshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnapShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/home.html");
		
		/* File src - Comes from Selenium
		 * File obj - Comes from Java Script
		 * FileUtils - Comes from Apache */
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File obj = new File("./snaps/img1.png");
		FileUtils.copyFile(src, obj);
		
		driver.close();
	}

}
