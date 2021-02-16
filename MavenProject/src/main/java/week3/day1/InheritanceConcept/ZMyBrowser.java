package week3.day1.InheritanceConcept;

public class ZMyBrowser extends Browser{
	
public static void main(String[] args) {
		
		Chrome methods = new Chrome();
		
		methods.chromBrowser();
		methods.searchBrowser(); // Overriden method of Browser class in chrome class
		methods.typeText();
		
		methods.getinBrowser(3, 4); // Overloading form Browser class
		
	}

}
