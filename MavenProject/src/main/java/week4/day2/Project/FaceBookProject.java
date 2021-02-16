package week4.day2.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FaceBookProject {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		driver.findElementByName("email").sendKeys("timcook");
		driver.findElementByName("pass").sendKeys("testleaf123");
		driver.findElementByXPath("//input[@value='Log In']").click();
			
		/*In some application, you will notice chrome notification and that can block Selenium interactions
		To disable those notification, use the below code:

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);*/
		/*boolean enabled = driver.findElementByXPath("(//input[@type='text'])[2]").isEnabled();
		System.out.println(enabled);*/
		
		driver.findElementByXPath("(//input[@type='text'])[1]").click();
		driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys("TestLeaf");
		Thread.sleep(3000);
		driver.findElementByXPath("(//button[@type='submit'])[1]").click();
		
		String text = driver.findElementByLinkText("TestLeaf").getText();
		if(text.contains("TestLeaf")) {
			System.out.println(text);	
		}
		
		Thread.sleep(3000);
		String buttonText = driver.findElementByXPath("(//button[@type='submit'])[2]").getText();
		if(buttonText.contains("Like")){
			System.out.println(buttonText);
		}
		
		driver.findElementByXPath("(//button[@type='submit'])[2]").click();
		
		/*Thread.sleep(3000);
		String buttonText1 = driver.findElementByXPath("(//button[@type='submit'])[2]").getText();
		if(buttonText.contains("Liked")){
			System.out.println("It is already Liked: " + buttonText1);
		}*/
		
		driver.findElementByXPath("(//a[text()='TestLeaf'])[1]").click();
		Thread.sleep(3000);
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		
		String noOfLikes = driver.findElementByXPath("(//div[contains(text(),'people')])[1]").getText();
		System.out.println(noOfLikes);
		
		driver.close();
	}
		
}
