package week1.day2;

public class ProgramPrintLowercaseChar {

	public static void main(String[] args) {
		
// Program to print lower case characters alone in a given string
		
		String str = "AmaZon";
		String replace = str.replaceAll("[A-Z]", "");
		System.out.println(replace);
		

	}

}
