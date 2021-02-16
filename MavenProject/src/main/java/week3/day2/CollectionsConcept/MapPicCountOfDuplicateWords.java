package week3.day2.CollectionsConcept;

import java.util.HashMap;
import java.util.Map;

public class MapPicCountOfDuplicateWords {

	public static void main(String[] args) {
		
		// Declaring a string to Store the name
		String name = "CompnayName";
		
		//Converting name in to Char Array and storing into array.
		char[] charArray = name.toCharArray();
		
		//Crate an empty Map with "character" as Key and "Integer" as Value
		Map<Character,Integer> letters = new HashMap<Character,Integer>();
		
		// Iterate using FOR loop
		for(char options: charArray) {
			if(letters.containsKey(options)) {
				letters.put(options, letters.get(options)+1);
			}
			else {
				letters.put(options, 1);
			}
		}
		System.out.println(letters);
	}

}
