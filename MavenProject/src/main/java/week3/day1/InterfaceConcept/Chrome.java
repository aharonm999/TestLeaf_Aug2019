package week3.day1.InterfaceConcept;

public class Chrome extends Browser{

	public void getTitle() {
		
	}

	public String getVersion() {
		
		return "version 1.0";
	}

	public String getName() {
	
		return "Chrome Driver";
	}

	@Override
	public String getCurrentUrl() {

		System.out.println("selenium hq website");
		return "Since it is a string method we are giving a string here";
	}

}
