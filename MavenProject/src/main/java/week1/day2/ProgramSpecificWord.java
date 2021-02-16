package week1.day2;

public class ProgramSpecificWord {

	public static void main(String[] args) {
		
		// Program to find count of INDIA in a given text
		
		String str = "amazon India development center has been established in year 2004 and has presence in 24 cities with in India";

		String[] split = str.split("India");
		System.out.println(split.length);
		
	}

}
