package week1.day2;

public class StringMethods {

	public static void main(String[] args) {
	// String can be declared in two ways. i.e 1>Literals 2>Creating Object
		// 1> Declaring String variable using Literal
		String str = "Aharon";
		System.out.println(str); // Aharon
		
		// 2> Declaring String creating an Object
		String str1 = new String("Sharon");
		System.out.println(str1); // Sharon
		
		// Declaring Char Array and Converting in to String 
		char[] ch = {'K','a','v','i','n','v','i','n','i'};
		String cnvrtingChartoString = new String(ch);
		System.out.println(cnvrtingChartoString); // Kavinvini
		
		// Length() - It gives the length of a given String
		String str2 = "Blossom";
		int lengthOfString = str2.length();
		System.out.println(lengthOfString);// 7
		
		// charAt() - It gives the character based on index value
		String str3 = "MavenProject";
		char charAtPosition5 = str3.charAt(5);
		System.out.println(charAtPosition5); // P
		
		// subString() - It allows to find the next string based on given index value
		String str4 = "JavaProject";
		String substringAfterIndex4 = str4.substring(4);
		System.out.println(substringAfterIndex4);// Project
		
		// contains() - It allows us to find char using text. It returns Boolean value
		String str5 = "OrcaleProject";
		boolean containsOornot = str5.contains("O");
		System.out.println(containsOornot); // true
		
		// startsWith() - It compares beginning word/letter in the given string. It returns Boolean value
		String str6 = "Google is top notch company";
		boolean startsWith = str6.startsWith("Google");
		System.out.println(startsWith); // true
		
		// endsWith() - It compares ending word/letter in the given string. It returns Boolean value
		String str7 = "Google is top notch company";
		boolean endsWith = str7.endsWith("company");
		System.out.println(endsWith); // true
		
		// toUpperCase() - It converts given string into Upper case
		String str8 = "uppercase";
		String upperCase = str8.toUpperCase();
		System.out.println(upperCase); // UPPERCASE
		
		// toLowerCase() - It converts given string into Lower case
		String str9 = "LOWERCASE";
		String lowerCase = str9.toLowerCase();
		System.out.println(lowerCase); // lowercase
		
		// toCharArray() - It converts String in to Character Array
		String str10 = "AmazonCompany";
		char[] charArray = str10.toCharArray();
		for(int i=0; i<charArray.length; i++) {
			System.out.println(charArray[i]); // It prints the string into individual character
		}
		
		// trim() - It removes the space either Left or Right and gives exact String
		String str11 = "          String contains space         ";
		String trim = str11.trim();
		System.out.println(trim); // String contains space
		
		// split() Ex1: - Splitting the given string by passing exact text  
		String str12 = "AmazonRainForest";
		String[] split1 = str12.split("Rain");
		for(String spliting: split1) {
		System.out.println(spliting); // Amazon Forest
		}
		
		// split() Ex2: - Splitting based on string and index value
		String str13 = "Amazon great india festival";
		String[] splitting2 = str13.split("great", 3);
		for(String split: splitting2) {
			System.out.println(split);
		}
		
		// split() Ex3: - Splitting based entire string
		String str22 = "Flipkart great india festival";
		String[] splitting3 = str22.split(" ");
		for(String split: splitting3) {
			System.out.println(split);
				}
		
		// equals() - Compares two strings  
		String str14 = "Maven";
		String str15 = "Java";
		boolean equals = str14.equals(str15);
		System.out.println(equals); // false
		
		// equalsIgnoreCase()
		String str16 = "Java";
		boolean equalsIgnoreCase = str16.equalsIgnoreCase(str15);
		System.out.println(equalsIgnoreCase); // true
		
		// replaceAll() - Ex1: replacing text with another text
		String str17 = "Java is 1 of the biggest OOPs concept language";
		String replaceText = str17.replaceAll("Java", "Oracle");
		System.out.println(replaceText); //Oracle is 1 of the biggest OOPs concept language
		
		// replaceAll() - Ex2: removing spaces between the string
		String str18 = "Java is 1 of the biggest OOPs concept language";
		String removeSpace = str18.replaceAll("\\s", "");
		System.out.println(removeSpace); // Javais1ofthebiggestOOPsconceptlanguage
		
		//replaceAll() - Ex3A: Printing numbers only from the given string
		String str19 = "Java is 1 of 9 the 7 biggest OOPs concept language";
		String printNumbers = str19.replaceAll("\\D", "");
		System.out.println(printNumbers); // 197
		
		//(OR)
		
		//replaceAll() - Ex3B: Printing numbers only from the given string
		String str20 = "Java is 1 of 9 the 7 biggest OOPs concept language";
		String printNumbers1 = str20.replaceAll("[^0-9]", "");
		System.out.println(printNumbers1); // 197
		
		//replaceAll() - Ex4: Removing numbers from the given string
		String str21 = "Java is 1 of 9 the 7 biggest OOPs concept language";
		String removeNumbers = str21.replaceAll("[0-9]", "");
		System.out.println(removeNumbers); // Java is of the biggest OOPs concept language
		
	}

}
