package week3.day2.CollectionsConcept;

import java.util.Set;
import java.util.TreeSet;

public class SetPicNamesWithS {

	public static void main(String[] args) {
	
		// Pick names starts with 'S' using "Set"
		
		Set<String> names = new TreeSet<String>();
		names.add("America");
		names.add("South Africa");
		names.add("Denmork");
		names.add("south America");
		names.add("Egypt");

		for(String options:names) {
			if(options.toUpperCase().startsWith("S")) {
				System.out.println(options);
			}
		}
		
	}

}
