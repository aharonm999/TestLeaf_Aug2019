package week3.day1.InheritanceConcept;

public class Chrome extends Browser{
	
	public void chromBrowser() {
		System.out.println("chromBrowser");
	}
	
	public void typeText() {
		System.out.println("typeText");
	}
	
	public void searchBrowser() {
		System.out.println("Chrome should override one of the method from Browser class");
	}

}
