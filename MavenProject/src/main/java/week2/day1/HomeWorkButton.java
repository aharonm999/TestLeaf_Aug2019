package week2.day1;

import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

public class HomeWorkButton {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		
		// Click button to travel home page
		driver.findElementById("home").click();
		
		// Find position of button (x,y)
		/*Steps:  1. Locate element for which you wants to retrieve x y coordinates.
				  2. Used points class to get x and y coordinates of element.	*/		
		WebElement getPosition = driver.findElementById("position");
		Point location = getPosition.getLocation();
		int xcordi = location.getX();
		System.out.println(xcordi);
		int ycordi = location.getY();
		System.out.println(ycordi);
		
		// Find button color - This code not working
		String buttonColor = driver.findElementById("color").getCssValue("background-color");
		/* The above code will return rgb value. If you want to convert to hex	*/
		System.out.println("Button Color:" + buttonColor);
				
		// Find the height and width
		Point ele = driver.findElementById("size").getLocation();
		System.out.println("X Position : "+ele.x);  
		System.out.println("Y Position : "+ele.y);  

		System.out.println("X getX : "+ele.getX());  
		System.out.println("Y gety : "+ele.getY()); 
		
		Rectangle ele1 = driver.findElementById("size").getRect();
		
		System.out.println("height : "+ele1.hashCode());
		System.out.println(" width : "+ele1.getWidth());  

		System.out.println("getHeight : "+ele1.getHeight());  
		System.out.println(" getWidth : "+ele1.getWidth());  

}
}