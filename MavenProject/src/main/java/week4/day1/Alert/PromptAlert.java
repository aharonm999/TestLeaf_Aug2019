package week4.day1.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		/* Alerts can handle in three ways :
		 1.void dismiss() ---- > driver.switchTo().alert().dismiss();  
		 2.void accept() -----> driver.switchTo().alert().accept();  
		 3.String getText()  -----> river.switchTo().alert().getText(); 
		 4.void sendKeys(String stringToSend) -----> driver.switchTo().alert().sendKeys("Text");  
		  */
		
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys("Aharon");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		String text2 = driver.findElementById("result1").getText();
		System.out.println(text2);

	}

}
