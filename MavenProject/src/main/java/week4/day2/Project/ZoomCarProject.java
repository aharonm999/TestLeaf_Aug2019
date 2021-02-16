package week4.day2.Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCarProject {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.zoomcar.com/chennai/");
		driver.findElementByXPath("//a[@title='Start your wonderful journey']").click();
		driver.findElementByXPath("(//div[@class='items'])[3]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		driver.findElementByXPath("(//div[@class='day low-price'])[1]").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		driver.findElementByXPath("//button[@class='proceed']").click();
		
		List<WebElement> price = driver.findElementsByXPath("//div[@class='price']");
		price.size();
		//creating an empty list to store the Integer value
		List<Integer> ls = new ArrayList<Integer>();
		
		for(WebElement eachoptions: price) {
			//System.out.println(eachoptions.getText().replaceAll("\\D", ""));
			//converting String to Integer
			int parseInt = Integer.parseInt(eachoptions.getText().replaceAll("\\D", ""));
			ls.add(parseInt);
			
			}
		Collections.sort(ls);
		Integer min = ls.get(0);
		//System.out.println(min);
		System.out.println(driver.findElementByXPath("//div[contains(text(),'"+min+"')]//preceding::h3[1]").getText()+" "+min);
		}
		
	}



