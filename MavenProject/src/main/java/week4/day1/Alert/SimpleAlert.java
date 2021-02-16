package week4.day1.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/* - Alerts are three types
		 1 - Simple Alert - having text, OK button
		 2 - Confirmation Alert - having text, OK button, Cancel button
		 3 - Prompt Alert - Having text, text area, OK button, Cancel button
		 
		 Alerts can handle in three ways :
		 1.void dismiss() ---- > driver.switchTo().alert().dismiss();  
		 2.void accept() -----> driver.switchTo().alert().accept();  
		 3.String getText()  -----> river.switchTo().alert().getText(); 
		 4.void sendKeys(String stringToSend) -----> driver.switchTo().alert().sendKeys("Text");  
		  */
		
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();


	}

}
