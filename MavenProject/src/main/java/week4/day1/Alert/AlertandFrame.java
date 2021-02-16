package week4.day1.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertandFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/* - Go to the URL given
		 * - click on the 'try it' button
		 * - enter your name in the Alert
		 * - Accept the Alert
		 * - Verify the name in the text  */
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys("Aharon");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String eleText = driver.findElementById("demo").getText();
		if(eleText.contains("Aharon")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}
}






